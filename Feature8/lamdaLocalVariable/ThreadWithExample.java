package com.feature8.lamda;

public class ThreadWithExample {
    public static void main(String[] args) {
        Runnable run=()->{
            Thread.currentThread().setName("myThread");
            System.out.println(Thread.currentThread().getName());
        };
        Thread ru=new Thread(run);
        ru.start();

    }
}
