package com.collection.Hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample3 {
    public static void main(String[] args) {
        HashMap h=new HashMap();
        h.put("Idli",10);
        h.put("Dosai",20);
        System.out.println(h);
        h.put("Idli",20);
        System.out.println(h);
        HashMap hm=new HashMap();
        hm.putAll(h);
        System.out.println(hm);
        System.out.println(hm.get("Dosai"));
        System.out.println(hm.containsKey("Dosai"));
        System.out.println(hm.containsValue(20));
        System.out.println(hm.remove("Idli"));
        System.out.println(hm);
        hm.clear();
        System.out.println(hm);
        Set s=h.entrySet();
        System.out.println(s);
        Collection c=h.values();
        System.out.println(c);

    }
}

