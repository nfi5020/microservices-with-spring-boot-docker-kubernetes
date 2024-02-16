package com.eazybytes.cards.service.impl;

import com.eazybytes.cards.constants.CardsConstants;
import com.eazybytes.cards.entity.Cards;
import com.eazybytes.cards.exception.CardAlreadyExistException;
import com.eazybytes.cards.repository.CardsRepository;
import com.eazybytes.cards.service.ICardsService;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Random;

@AllArgsConstructor
@Component
public class CardsServiceImpl implements ICardsService {
    private CardsRepository cardsRepository;

    @Override
    public void createCard(String mobileNumber) {
        Optional<Cards> card = cardsRepository.findByMobileNumber(mobileNumber);
        if (card.isPresent()){
            throw new CardAlreadyExistException("Card already exists with given mobile number: " + mobileNumber);
        }
        cardsRepository.save(createNewCard(mobileNumber));
    }

    private Cards createNewCard(String mobileNumber) {
        Cards card = new Cards();
        long randomCardNumber = 100000000000L + new Random().nextInt(900000000);
        card.setMobileNumber(mobileNumber);
        card.setCardNumber(Long.toString(randomCardNumber));
        card.setCardType(CardsConstants.CREDIT_CARD);
        card.setTotalLimit(CardsConstants.NEW_CARD_LIMIT);
        card.setAmountUsed(0);
        card.setAvailableAmount(CardsConstants.NEW_CARD_LIMIT);
        return card;
    }
}
