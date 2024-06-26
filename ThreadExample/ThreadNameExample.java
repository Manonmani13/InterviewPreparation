package com.proretention.scrm.calendar;

public class ThreadNameExample extends Thread {
    @Override
    public void run() {
        System.out.println("Run thread");
    }

    public static void main(String[] args) {
        ThreadNameExample tne=new ThreadNameExample();
        tne.start();
        System.out.println(tne.getName());
        tne.setName("Test Thread");
        System.out.println(tne.getName());
    }
}
