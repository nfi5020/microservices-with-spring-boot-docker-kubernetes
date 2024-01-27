package com.eazybytes.accounts.dto;

import lombok.Data;

/**
 * This class get used to encapsulate the Accounts object.
 */
@Data
public class AccountsDto {

    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
