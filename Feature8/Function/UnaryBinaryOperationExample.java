package com.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperationExample {
    public static void main(String[] args) {
        UnaryOperator<String> uo1= name->name.toUpperCase();
        System.out.println(uo1.apply("manonmani"));
        UnaryOperator<Integer> uo2=x->x*12;
        System.out.println(uo2.apply(23));
        Comparator<Integer> comp=(a,b)->a.compareTo(b);
        BinaryOperator<Integer> bo1=BinaryOperator.minBy(comp);
        BinaryOperator<Integer> bo2=BinaryOperator.maxBy(comp);
        System.out.println(bo2.apply(10,20));
        System.out.println(bo1.apply(20,30));
        //unary and binary operator will return whatever we pass

    }
}
