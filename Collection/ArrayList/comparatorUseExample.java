package com.collection.ArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class comparatorUseExample {
    public static void main(String[] args) {
        String[] names = {"Naveen","Manonmani","Pandukumar","Chandar"};
        Comparator demo=new ComparatorCompareToDemo();
        Arrays.sort(names,demo);
        for(String s:names)
            System.out.println( s);
    }
}
