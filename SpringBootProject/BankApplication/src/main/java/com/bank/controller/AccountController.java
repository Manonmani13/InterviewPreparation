package com.bank.controller;

import com.bank.dto.AccountDto;
import com.bank.service.AccountService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController  {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto)
    {
        return  new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccounts(@PathVariable Long id)
    {
        AccountDto dto= accountService.getAccountById(id);
        return  ResponseEntity.ok(dto);

    }


}
