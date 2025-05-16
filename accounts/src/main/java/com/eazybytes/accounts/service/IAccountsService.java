package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.repository.CustomerRepository;

import java.text.ParseException;

public interface IAccountsService {


    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto) throws ParseException;

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Accounts Details based on a given mobileNumber
     */
    CustomerDto fetchAccountDetails(String mobileNumber) throws Throwable;

    boolean updateAccount(CustomerDto customerDto) throws Throwable;

    boolean deleteAccount(String mobileNumber) throws Throwable;
}
