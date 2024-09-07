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
		pk.setAccId(101);
		pk.setAccType("CURRENT");
		pk.setHolderName("IBM");
		Account ac=new Account();
		ac.setBranchName("Pallikaranai");
		ac.setMinBal(10000.00);
//	ac.setAccountPc(pk);
		ac.setAccId(101);
		ac.setAccType("CURRENT");
		ac.setHolderName("IBM");
		accRepo.save(ac);
	
	}

}
