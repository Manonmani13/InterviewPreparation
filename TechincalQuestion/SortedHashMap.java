package com.practices.techinicalQuestion;

import java.util.*;

public class SortedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Mano",10);
        scores.put("Naveen",11);
        scores.put("chandar",12);
        scores.put("Pandukumar",13);
        System.out.println(scores);
        Map<String, Integer> soretedByValue = new HashMap<>();
        Set<Map.Entry<String,Integer>> entrySet=scores.entrySet();
        System.out.println(entrySet);
        List<Map.Entry<String,Integer>> entryList=new ArrayList<>(entrySet);
        System.out.println(entryList);
        entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
        System.out.println(entryList);
        for(Map.Entry<String,Integer> s:entryList)
            soretedByValue.put(s.getKey(),s.getValue());
        System.out.println(soretedByValue);
    }
}
