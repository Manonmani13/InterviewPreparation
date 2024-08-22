package com.onetomany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.transaction.Transactional;

@Entity
@Transactional
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private Long addressId;
    private String city;
    private String addressType;
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public Address(Long addressId, String city, String addressType) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.addressType = addressType;
	}
	public Address() {
		super();
	}

    // for bidirectional one to one mapping
    //@OneToOne(mappedBy = "address")
    //private Employee employee;

//    @ManyToOne
//    @JoinColumn(name = "fk_emp_id")
//    private Employee employee;
    
    
}