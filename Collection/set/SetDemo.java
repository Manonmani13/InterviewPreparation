package com.collection.set;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("Naveen");
        h.add("kirthu");
        h.add("Harsha");
        h.add("Naveen");
        System.out.println(h);
    }
}
