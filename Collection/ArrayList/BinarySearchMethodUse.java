package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchMethodUse {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("Naveen");
        al.add("Mano");
        al.add("Selvam");
        al.add("Pandukumar");
        al.add("Maha");
        al.add("Uma");
        al.add("Deepthi");
        al.add("Prasath");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println(Collections.binarySearch(al,"Deepthi"));


    }
}
