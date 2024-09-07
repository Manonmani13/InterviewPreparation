package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.AccountRepository;
import com.ashokit.entity.Account;
import com.ashokit.entity.AccountPC;

@Service
public class AccountService {
	@Autowired
	AccountRepository accRepo;
	
	public void saveData()
	{	
		AccountPC pk=new AccountPC();
		pk.setAccId(102);
		pk.setAccType("CURRENT");
		pk.setHolderName("DD");
		Account ac=new Account();
		ac.setBranchName("Oil Mill");
		ac.setMinBal(10000.00);
	ac.setAccountPc(pk);
		
		accRepo.save(ac);
	
	}

}
