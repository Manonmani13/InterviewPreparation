package com.collection.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        String[] names = {"Naveen","Manonmani","Pandukumar","Chandar"};
        Comparator demo=new ComparatorDemo();
        Arrays.sort(names,demo);
        for(String s:names)
        System.out.println( s);

    }
}
