package com.ashokit.entity;

import java.sql.Date;
import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
public class InsurancePlan {
	@Id
	@GeneratedValue
	private Integer palnId;
	
	private String planName;
	
	private  String planStatus;
	@CreationTimestamp
	@Column(updatable = false)
	@Temporal(TemporalType.DATE)
    private LocalDate createdDate;
	@UpdateTimestamp
	@Column(insertable = false)
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
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public InsurancePlan(Integer palnId, String planName, String planStatus, LocalDate createdDate, Date updatedDate) {
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
