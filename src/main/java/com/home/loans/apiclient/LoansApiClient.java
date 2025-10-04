package com.home.loans.apiclient;

import com.home.loans.dtos.LoanDTO;
import com.home.loans.dtos.common.ResponseDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Validated
public interface LoansApiClient {

    ResponseEntity<ResponseDTO> createLoan(@RequestParam
                                           @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
                                           String mobileNumber);

    ResponseEntity<LoanDTO> fetchLoanDetails(@RequestParam
                                             @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
                                             String mobileNumber);

    ResponseEntity<ResponseDTO> updateLoanDetails(@Valid @RequestBody LoanDTO loanDTO);

    ResponseEntity<ResponseDTO> deleteLoanDetails(@RequestParam
                                                  @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
                                                  String mobileNumber);

}
