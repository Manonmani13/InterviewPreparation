package com.onetoonerelationship.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne
    private Address addressData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public User(Long id, String name, Address addressData) {
        this.id = id;
        this.name = name;
        this.addressData = addressData;
    }

    public Address getAddressData() {
        return addressData;
    }

    public void setAddressData(Address addressData) {
        this.addressData = addressData;
    }

}
