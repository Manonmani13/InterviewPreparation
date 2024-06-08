package com.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Integer> f4=x->x*2;
        Function<Integer,Integer> f5=x->x*x;


        System.out.println(f4.apply(2));
        System.out.println(f4.compose(f5).apply(3));
        Function<String,String> identity=Function.identity();
        System.out.println(identity.apply("Manonmani"));
    }
}
