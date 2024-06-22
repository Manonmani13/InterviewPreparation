package com.feature8.lamda;

import java.util.TreeSet;

public class TreeSetExampleLamda {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>((s1,s2)->s2.compareTo(s1));
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        for(String s:ts)
            System.out.println(s);
    }
}
