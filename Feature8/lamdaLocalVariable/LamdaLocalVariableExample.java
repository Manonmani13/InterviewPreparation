package com.lamdaLocalVariable;

import java.util.function.Consumer;

public class LamdaLocalVariableExample {
    static int k=30;
    public static void main(String[] args) {
        int i=10;
        Consumer<Integer> c1=j->{
            System.out.println("Value J "+j);
            System.out.println("Value I "+i);
            System.out.println("Value K "+k);
            k=10;
            System.out.println(k);

        };
        c1.accept(10);
    }
}
