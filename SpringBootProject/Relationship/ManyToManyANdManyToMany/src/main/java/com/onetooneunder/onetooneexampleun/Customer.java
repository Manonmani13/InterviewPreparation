package com.onetooneunder.onetooneexampleun;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name="customer_item",
  joinColumns = {@JoinColumn(name="customer_fk")},
  inverseJoinColumns = {@JoinColumn(name="item_fk")})
    private Set<Item> item=new HashSet<>();

    public Set<Item> getItem() {
        return item;
    }

    public void setItem(Set<Item> item) {
        this.item = item;
    }

    public Customer() {

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

    public Customer(String name) {
        this.name = name;
    }
}
