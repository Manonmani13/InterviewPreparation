package com.proretention.scrm.calendar;

import java.util.ArrayList;
import java.util.List;

public class ArraysToList {



    public static void main(String[] args) {
       List<String> names=new ArrayList<>();
       names.add("mano");
       names.add("manonmani");
       String array[]=names.toArray(new String[names.size()]);
       for(String arra:array)
        System.out.println(arra);
    }
}
