package com.ashokit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Account;
import com.ashokit.entity.AccountPC;

public interface AccountRepository extends JpaRepository<Account, AccountPC> {

}
