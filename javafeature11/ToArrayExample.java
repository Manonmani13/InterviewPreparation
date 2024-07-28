package com.practices.javafeature11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayExample {
    public static void main(String[] args) {
        List<String> ls=Arrays.asList("Manonmani","Pandukumar","Naveen");
        String names[]=ls.toArray(new String[ls.size()]);
        names=ls.toArray(String[]::new);
        System.out.println(names.length);
        for(String name:names)
        System.out.println(name);
    }
}
