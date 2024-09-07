package com.ashokit.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class InsurancePlan {
	@Id
	@GeneratedValue
	private Integer palnId;
	
	private String planName;
	
	private  String planStatus;
	@CreationTimestamp
	private Date createdDate;
	@UpdateTimestamp
	private Date updatedDate;
	public Integer getPalnId() {
		return palnId;
	}
	public void setPalnId(Integer palnId) {
		this.palnId = palnId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public InsurancePlan(Integer palnId, String planName, String planStatus, Date createdDate, Date updatedDate) {
		super();
		this.palnId = palnId;
		this.planName = planName;
		this.planStatus = planStatus;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	public InsurancePlan() {
		super();
	}
	@Override
	public String toString() {
		return "InsurancePlan [palnId=" + palnId + ", planName=" + planName + ", planStatus=" + planStatus
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
	
	

}
