package com.practices.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(3,"Pandukumar");
        m.put(2,"Naveen");

        m.put(1,"Manonmani");
        m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//        System.out.println(m.entrySet());
    }
}
