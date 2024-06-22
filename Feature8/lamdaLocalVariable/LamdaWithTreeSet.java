package com.feature8.lamda;

import java.util.TreeSet;

public class LamdaWithTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>((o1,o2)->(o1>o2)?-1:(o1<o2)?+1:0);
        ts.add(200);
        ts.add(120);
        ts.add(300);
        ts.add(4);
        System.out.println(ts);
    }
}
