package com.proretention.scrm.calendar;

import java.util.TreeSet;

public class TreeSetExampleDesc2 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add("Pandukumar");

        ts.add("Manonmani");
        ts.add("Maha");
        System.out.println(ts);
        System.out.println(ts.descendingSet());
        System.out.println(ts.headSet("Pandukumar",true));
        System.out.println(ts.tailSet("Pandukumar",true));
        System.out.println("SubSet: "+ts.subSet("Pandukumar", false, "Manonmani", true));


    }
}
