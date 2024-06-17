package com.collection.ArrayList;

public class Laptop {
    int price;

    int gb;
    boolean touch;
    String moodel;

    public Laptop(int price, int gb, boolean touch) {
        this.price = price;
        this.gb = gb;
        this.touch = touch;
    }

    public Laptop(int price, int gb, boolean touch, String moodel) {
        this.price = price;
        this.gb = gb;
        this.touch = touch;
        this.moodel = moodel;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", gb=" + gb +
                ", touch=" + touch +
                ", moodel='" + moodel + '\'' +
                '}';
    }
}

