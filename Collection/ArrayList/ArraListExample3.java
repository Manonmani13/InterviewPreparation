package com.collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraListExample3 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add("Naveen");

        System.out.println(al);
        al.set(2,"Naveen Chandar");
        System.out.println(al);

    }
}
