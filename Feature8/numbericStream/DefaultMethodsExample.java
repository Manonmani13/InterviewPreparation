package com.proretention.scrm.calendar;

import java.util.PriorityQueue;

public class DefaultMethodsExample implements Says {
    public static void main(String[] args) {
        DefaultMethodsExample s=new DefaultMethodsExample();
        s.say();
    }
}
interface  Says{
    default  void say()
    {
        System.out.println("Hi");
    }

}
