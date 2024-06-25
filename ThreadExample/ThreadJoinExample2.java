package com.Thread;

import java.security.spec.ECField;

public class ThreadJoinExample2 {
    public static void main(String[] args) {
        ThreadJoinExample1 tj=new ThreadJoinExample1();
        ThreadJoinExample1 tj2=new ThreadJoinExample1();
        try{
            tj.start();
            System.out.println("The current thread name is: " + Thread.currentThread().getName());

            tj.join();
            tj2.start();
            System.out.println("The current thread name is: " + Thread.currentThread().getName());

            tj2.join();
        }catch (Exception e){

        }

    }
}
