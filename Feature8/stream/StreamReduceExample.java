package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamReduceExample {
    public static void main(String[] args) {
        BinaryOperator<Integer>  bo=(a,b)->a+b;
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> sum=list.stream().reduce((a, b)->a+b);
        System.out.println(sum.get());
    }
}
