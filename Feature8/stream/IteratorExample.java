package com.stream;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class IteratorExample {

    public static void main(String[] args) {
        UnaryOperator<Integer> uo=x->x+5;
        //ordered infinit
        Stream<Integer> s1=Stream.iterate(0,uo).limit(10);
        s1.forEach(System.out::println);

        Supplier<Double> supp=Math::random;
        //unordered infinit
        Stream<Double> s2=Stream.generate(supp);
        s2.forEach(System.out::println);
    }
}
