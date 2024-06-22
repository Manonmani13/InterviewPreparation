package com.bank.service;

import com.bank.dto.AccountDto;
import com.bank.enitity.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    AccountDto createAccount(AccountDto account);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id,double amount);
}
