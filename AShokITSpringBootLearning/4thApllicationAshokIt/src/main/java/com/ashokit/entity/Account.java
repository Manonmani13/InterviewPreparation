package com.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(AccountPC.class)
public class Account {
	
	private String branchName;
	
	private Double minBal;
	
//	private AccountPC accountPc;

	@Id
	private Integer accId;
	@Id
	private String accType;
	@Id
	private String holderName;


//	public AccountPC getAccountPc() {
//		return accountPc;
//	}
//
//	public void setAccountPc(AccountPC accountPc) {
//		this.accountPc = accountPc;
//	}

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

	
	public Integer getAccId() {
		return accId;
	}

	public void setAccId(Integer accId) {
		this.accId = accId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public Account(String branchName, Double minBal, Integer accId, String accType, String holderName) {
		super();
		this.branchName = branchName;
		this.minBal = minBal;
		this.accId = accId;
		this.accType = accType;
		this.holderName = holderName;
	}

	public Account() {
		super();
	}

	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", minBal=" + minBal + "]";
	}

}
