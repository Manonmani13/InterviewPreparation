package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductExampleJTP1 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Float> pr=productsList.stream()
                .filter(p->p.price>30000)
                .map(p->p.price)
                .collect(Collectors.toList());
        System.out.println(pr);
    }
}
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

