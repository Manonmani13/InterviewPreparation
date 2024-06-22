package com.feature8.lamda;

import java.util.ArrayList;
import java.util.Collections;

public class LamdaWithArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(20);
        al.add(10);
        al.add(4);
        al.add(2);
        al.add(30);
        System.out.println("Element of ArrayList "+al);
        Collections.sort(al,(o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        System.out.println(al);
    }
}
