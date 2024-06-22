package com.bank.mapper;

import com.bank.dto.AccountDto;
import com.bank.enitity.Account;

public class AccountMapper {
    public static Account maptToAccount(AccountDto accountDto)
    {
        Account account=new Account(accountDto.getId(),accountDto.getAccountHolderName(),accountDto.getBalance());
        return account;
    }
    public static AccountDto mapToAccountDto(Account account)
    {
        AccountDto dto=new AccountDto();
        dto.setId(account.getId());
        dto.setAccountHolderName(account.getAccountHolderName());
        dto.setBalance(account.getBalance());
        return dto;
    }
}
