package com.onetooneunder.onetooneexampleun;

import jakarta.persistence.*;

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
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "item")

    private Customer customer;

}
