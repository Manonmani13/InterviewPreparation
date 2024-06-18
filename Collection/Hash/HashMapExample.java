package com.collection.Hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap hs=new HashMap();
        hs.put("Mano",10);
        hs.put("Naveen",20);
        System.out.println(hs);
        Set s=hs.keySet();
        System.out.println("Key "+s);
        Collection c=hs.values();
        System.out.println(c);
    }
}
