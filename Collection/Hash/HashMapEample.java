package com.collection.Hash;

import com.collection.ArrayList.Laptop;

import java.util.HashMap;

public class HashMapEample {
    public static void main(String[] args) {
        Laptop del=new Laptop(45000,8,true);
        Laptop lenovo=new Laptop(5500086,7,false);
        Laptop hp=new Laptop(40000,9,true);
        HashMap hm=new HashMap();
        hm.put(del,123);
        hm.put(lenovo,124);
        hm.put(hp   ,125);
        System.out.println(hm);



    }
}
