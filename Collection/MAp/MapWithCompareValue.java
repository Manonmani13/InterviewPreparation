package com.practices.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapWithCompareValue {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(3,"Pandukumar");
        m.put(2,"Naveen");
        m.put(1,"Manonmani");
        m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        m.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

    }
}
