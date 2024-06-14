package com.numbericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbericStreamForExample {
    public static void main(String[] args) {
        double sumofDouble=map2Double();
        System.out.println(sumofDouble);
        long sumoflong=map2Long();
        System.out.println(sumoflong);
        System.out.println(map2Object());

    }
    static double map2Double()
    {
        return IntStream.rangeClosed(1,10)
                .mapToDouble(x->x)
                .sum();
    }
    static long  map2Long()
    {
        return IntStream.rangeClosed(1,5)
                .mapToLong(x->x).sum();
    }
    static List<Integer> map2Object()
    {
        return IntStream.rangeClosed(1,20).mapToObj(x->x).collect(Collectors.toList());
    }



}
