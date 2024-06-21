package com.feature8.lamda;

@FunctionalInterface
interface MyFunction{
    void print(String msg);
    static void m1()
    {
        System.out.println("default method");
    }

}

public class MyFunctional {
    public static void main(String[] args) {
        MyFunction.m1();
    }
}
