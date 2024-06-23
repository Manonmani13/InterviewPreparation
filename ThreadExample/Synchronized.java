package com.Thread;

public class Synchronized{
    public static void main(String[] args) {
        Counter counter=new Counter();
        Thread t1=new Thread(new CakeCounterExampleSync(counter));
        Thread t2=new Thread(new CakeCounterExampleSync(counter));
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception e){}
        System.out.println(counter.cakeCounter);

    }
}