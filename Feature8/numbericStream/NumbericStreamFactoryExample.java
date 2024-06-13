package com.numbericStream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumbericStreamFactoryExample {
    public static void main(String[] args) {
        IntStream l1=IntStream.range(1,6);
        IntStream l2=IntStream.rangeClosed(1,6);
        l1.forEach(System.out::println);
        System.out.println("====================");
        l2.forEach(System.out::println);
        LongStream.rangeClosed(1,50).forEach(System.out::println);
        DoubleStream ds=LongStream.rangeClosed(1,20).asDoubleStream();
        ds.forEach(System.out::println);
    }
}
