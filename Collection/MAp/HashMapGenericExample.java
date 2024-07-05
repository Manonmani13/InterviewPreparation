package com.practices.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapGenericExample {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"Manonmani");
        m.put(2,"Naveen");
        m.put(3,"Pandukumar");
        for(Map.Entry mm:m.entrySet())
        {
            System.out.println(mm.getKey()+" "+mm.getValue());
        }
    }
}
