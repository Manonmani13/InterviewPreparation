package com.proretention.scrm.calendar;

public class MultiTasking2 {


    public MultiTasking2(Runnable r) {
        System.out.println(r);
    }

    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("running");
            }
        };
            Thread mt=new Thread(r);
        Thread t2=new Thread(r);
            mt.start();
            t2.start();
    }

}
