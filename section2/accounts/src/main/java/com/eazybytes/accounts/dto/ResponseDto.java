package com.eazybytes.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * This class helps with populating the success API response.
 */
@Data@AllArgsConstructor
public class ResponseDto {

    private String status;
    private String statusMsg;
}
