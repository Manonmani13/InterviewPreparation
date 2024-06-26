package com.proretention.scrm.calendar;

public class ThreadNameExampleWName extends Thread {
    @Override
    public void run() {
        System.out.println("Run thread");
    }
    ThreadNameExampleWName(String a)
    {
        super(a);
    }


    public static void main(String[] args) {
        ThreadNameExampleWName tne=new ThreadNameExampleWName("Testing");
        tne.start();
        System.out.println(tne.getName());
    }
}
