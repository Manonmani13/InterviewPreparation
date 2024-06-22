package com.bank.service;

import com.bank.dto.AccountDto;
import com.bank.enitity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    AccountDto createAccount(AccountDto account);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id,double amount);
    AccountDto withdraw(Long id,double amount);
    List<AccountDto> getAllAccount();
    void deleteAccountById(Long id);

}
