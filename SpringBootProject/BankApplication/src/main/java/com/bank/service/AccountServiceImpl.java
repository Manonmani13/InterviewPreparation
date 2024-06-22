package com.bank.service;

import com.bank.dto.AccountDto;
import com.bank.enitity.Account;
import com.bank.mapper.AccountMapper;
import com.bank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public AccountDto deposit(Long id, double amount) {
        Account account=accountRepository.findById(id).orElseThrow(()->new RuntimeException("Account does not exist"));
        double total=account.getBalance()+amount;
        account.setBalance(total);
        Account acc =accountRepository.save(account);
        return AccountMapper.mapToAccountDto(acc);
    }

    @Override
    public AccountDto withdraw(Long id, double amount) {
        Account account=accountRepository.findById(id).orElseThrow(()->new RuntimeException("Account does not exist"));
        if(account.getBalance()<amount)
        {
            throw new  RuntimeException("Insuffient Balance");
        }
        double total=account.getBalance()-amount;
        account.setBalance(total);
        Account acc =accountRepository.save(account);
        return AccountMapper.mapToAccountDto(acc);
    }

    @Override
    public List<AccountDto> getAllAccount() {
        List<Account> ammounts=accountRepository.findAll();
        return ammounts.stream().map((account -> AccountMapper.mapToAccountDto(account))).collect(Collectors.toList());
    }

    @Override
    public void deleteAccountById(Long id) {
        Account acc=accountRepository.findById(id).orElseThrow(()->new RuntimeException(("Account not exists")));
        accountRepository.deleteById(id);
    }


}
