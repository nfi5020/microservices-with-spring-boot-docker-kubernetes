package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.constants.AccountsConstants;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.dto.ResponseDto;
import com.eazybytes.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * This class routes API call that has /api in it to this class.
 */
@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountController {

    // Constructor injection happening thanks to the lombok annotation
    private IAccountsService iAccountsService;

    /**
     * This method takes customer details and creates a customer if customer exists with the given phonenumber and creates a bank account as well. It returns ResponseDto as response if success else returns ErrorResponseDto
     * @param customerDto
     * @return
     */
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto){

        iAccountsService.createAccount(customerDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }

    /**
     * This method take mobileNumber as input and check if any Customer exist. If customer exists then it retrieves customer account details and returns both customer/account details else it returns error message.
     * @param mobileNumber
     * @return
     */
    @GetMapping("/fetch")
    public ResponseEntity<CustomerDto> fetchAccountDetails(@RequestParam String mobileNumber){
        CustomerDto customerDto = iAccountsService.fetchAccount(mobileNumber);

        return ResponseEntity.status(HttpStatus.OK)
                .body(customerDto);
    }
}
