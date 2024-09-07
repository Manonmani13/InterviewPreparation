package com.ashokit.service;

import java.util.Optional;
import java.util.OptionalInt;

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
	public void getData()
	{
		AccountPC  ac=new AccountPC();
		
		ac.setAccId(101);
		ac.setAccType("CURRENT");
		ac.setHolderName("IBM");
		
		Optional<Account> find=accRepo.findById(ac);
		if(find.isPresent())
		{
			System.out.println(find.get());
		}
	}
}
