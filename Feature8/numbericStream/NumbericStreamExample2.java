package com.numbericStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class NumbericStreamExample2 {
    public static void main(String[] args) {
        BinaryOperator<Integer> bo=(x,y)->x+y;
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        System.out.println(list.stream().reduce(0,bo));
        IntStream l2=IntStream.rangeClosed(0,6);
        System.out.println(l2.sum());

    }
}
