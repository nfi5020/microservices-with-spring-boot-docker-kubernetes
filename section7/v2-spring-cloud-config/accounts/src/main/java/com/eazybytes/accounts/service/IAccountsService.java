package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

/**
 * This interface takes the below method and returns object based on the method implementation.
 */
public interface IAccountsService {

    /**
     * Create a customer and account for a customer if customer not in DB.
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    /**
     * Search the DB for customer and account number. Search both customer and account increase there is data miss match in DB and throw exception accordingly.
     * @param mobileNumber
     * @return
     */
    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
