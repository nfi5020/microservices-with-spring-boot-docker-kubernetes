package com.eazybytes.cards.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cards extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cardId;
    private String mobileNumber;
    private String cardNumber;
    private String cardType;
    private int totalAmount;
    private int amountUsed;
    private int availableAmount;

}
