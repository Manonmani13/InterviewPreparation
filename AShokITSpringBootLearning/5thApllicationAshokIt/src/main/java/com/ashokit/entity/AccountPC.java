 package com.ashokit.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Embeddable
public class AccountPC implements Serializable {
	
	private Integer accId;
	
	private String accType;
	
	private String holderName;

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

	public AccountPC(Integer accId, String accType, String holderName) {
		super();
		this.accId = accId;
		this.accType = accType;
		this.holderName = holderName;
	}

	public AccountPC() {
		super();
	}

	@Override
	public String toString() {
		return "AccountPC [accId=" + accId + ", accType=" + accType + ", holderName=" + holderName + "]";
	}
	

}
