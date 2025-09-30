package com.home.loans.mapper;

import com.home.loans.dtos.LoanDTO;
import com.home.loans.entity.Loan;

public class LoansMapper {
    public static LoanDTO mapToLoansDto(Loan loan, LoanDTO loansDto) {
        loansDto.setLoanNumber(loan.getLoanNumber());
        loansDto.setLoanType(loan.getLoanType());
        loansDto.setMobileNumber(loan.getMobileNumber());
        loansDto.setTotalLoan(loan.getTotalLoan());
        loansDto.setAmountPaid(loan.getAmountPaid());
        loansDto.setOutstandingAmount(loan.getOutstandingAmount());
        return loansDto;
    }

    public static Loan mapToLoans(LoanDTO loansDto, Loan loans) {
        loans.setLoanNumber(loansDto.getLoanNumber());
        loans.setLoanType(loansDto.getLoanType());
        loans.setMobileNumber(loansDto.getMobileNumber());
        loans.setTotalLoan(loansDto.getTotalLoan());
        loans.setAmountPaid(loansDto.getAmountPaid());
        loans.setOutstandingAmount(loansDto.getOutstandingAmount());
        return loans;
    }
}
