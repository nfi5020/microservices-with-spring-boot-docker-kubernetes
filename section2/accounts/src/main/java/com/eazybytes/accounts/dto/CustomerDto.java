package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;

/**
 * This class get used to encapsulate the Customer object.
 */
@Data
public class CustomerDto {

    private String name;

    private String email;

    private String mobileNumber;

    private AccountsDto accountsDto;
}
