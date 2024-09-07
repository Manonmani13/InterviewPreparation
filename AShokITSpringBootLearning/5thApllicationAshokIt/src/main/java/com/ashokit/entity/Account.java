package com.ashokit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
//@IdClass(AccountPC.class)
public class Account {
	
	private String branchName;
	
	private Double minBal;
	@EmbeddedId
	private AccountPC accountPc;

	
	public AccountPC getAccountPc() {
		return accountPc;
	}

	public void setAccountPc(AccountPC accountPc) {
		this.accountPc = accountPc;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Double getMinBal() {
		return minBal;
	}

	public void setMinBal(Double minBal) {
		this.minBal = minBal;
	}


	public Account(String branchName, Double minBal, Integer accId, String accType, String holderName) {
		super();
		this.branchName = branchName;
		this.minBal = minBal;
		
	}

	public Account() {
		super();
	}

	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", minBal=" + minBal + "]";
	}

}
