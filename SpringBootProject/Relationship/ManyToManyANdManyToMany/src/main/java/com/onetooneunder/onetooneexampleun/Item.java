package com.onetooneunder.onetooneexampleun;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Item {

    @Id
    @GeneratedValue

    private Long id;

    private String name;



    public Item() {

    }

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

    public Item(String name) {
        this.name = name;
    }
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "item")
    private Set<Customer> customer=new HashSet<>();

    public Set<Customer>  getCustomer() {
        return customer;
    }

    public void setCustomer(Set<Customer>  customer) {
        this.customer = customer;
    }
}
