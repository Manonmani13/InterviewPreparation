package com.proretention.scrm.calendar;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> ts = new ArrayList<>();
        ts.add("Pandukumar");

        ts.add("Manonmani");
        ts.add("Maha");
       ts.forEach(System.out::println);
       ts.stream().forEachOrdered(System.out::println);
    }
}
