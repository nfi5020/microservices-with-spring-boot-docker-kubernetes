package com.eazybytes.cards.service;

import com.eazybytes.cards.entity.Cards;

public interface ICardsService {
    void createCard (String mobileNumber);
    Cards createNewCard(String mobileNumber);
}
