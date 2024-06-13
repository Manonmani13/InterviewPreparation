package com.numbericStream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumbericStreamFactoryMethod {
    public static void main(String[] args) {
        OptionalInt in= IntStream.rangeClosed(0,20).max();
        System.out.println(in.getAsInt());
        OptionalInt min= IntStream.rangeClosed(0,20).min();
        System.out.println(min.getAsInt());
        OptionalDouble aver= IntStream.rangeClosed(0,20).average();
        System.out.println(aver.getAsDouble());

    }
}
