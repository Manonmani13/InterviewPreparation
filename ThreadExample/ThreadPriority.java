package com.proretention.scrm.calendar;

public class ThreadPriority extends Thread {
    @Override
    public void run() {
        System.out.println("Run thread");
    }



    public static void main(String[] args) {
        ThreadPriority tne=new ThreadPriority();
        tne.start();
        System.out.println(tne.getPriority());
        tne.setPriority(2);
        System.out.println(tne.getPriority());

    }
}
