package com.bank.service;

import com.bank.dto.AccountDto;
import com.bank.enitity.Account;
import com.bank.mapper.AccountMapper;
import com.bank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    private AccountRepository accountRepository;

    @Override
    public   AccountDto createAccount(AccountDto account) {
        Account dto= AccountMapper.maptToAccount(account);
        Account acc=accountRepository.save(dto);
        return AccountMapper.mapToAccountDto(acc);
    }

    @Override
    public AccountDto getAccountById(Long id) {
       Account account= accountRepository.findById(id).orElseThrow(()->new RuntimeException("Account Does not Exists"));
        return AccountMapper.mapToAccountDto(account);
    }


}
