package com.practices.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet ls=new LinkedHashSet();
        ls.add("Manonmani");
        ls.add("Naveen");
        ls.add("Pandukumar");
        System.out.println(ls);
        System.out.println(ls.remove("Manonmani"));
        System.out.println(ls);
    }
}
