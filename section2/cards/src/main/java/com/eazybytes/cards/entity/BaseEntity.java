package com.eazybytes.cards.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter@Setter@ToString
public class BaseEntity {
    private String createdAt;
    private String createdBy;
    private String updatedBy;
    private String updatedAt;
}
