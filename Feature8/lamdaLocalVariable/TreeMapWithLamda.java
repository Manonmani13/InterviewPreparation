package com.feature8.lamda;

import java.util.TreeMap;

public class TreeMapWithLamda {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>((o1,o2)->(o1>o2)?-1:(o1<o2)?+1:0);
        tm.put(1,"Apple");
        tm.put(4,"Mango");
        tm.put(3,"Orange");
        tm.put(2,"Banana");
        System.out.println(tm);
    }
}
