package com.methodReference;

import java.lang.reflect.Method;
import java.util.Comparator;

public class MethodReferenceExample {
    public static void main(String[] args) {
        System.out.println(MethodReferenceExample.compare(10,20));
        Comparator<Integer> comp=MethodReferenceExample::compare;
        Comparator<Integer> comp2=(c,b)->compare(c,b);
        System.out.println("In Java 8"+comp.compare(20,20));
        System.out.println(comp2.compare(20,30));
    }
    public static int compare(Integer a,Integer b)
    {
        return Integer.compare(a,b);
    }

}
