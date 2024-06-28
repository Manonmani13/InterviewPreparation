package com.Thread;

public class ThreadGroupExample implements  Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupExample tge=new ThreadGroupExample();
        ThreadGroup tg=new ThreadGroup("parent Thread Group");
        Thread t1=new Thread(tg,tge,"First Thread");
        Thread t2=new Thread(tg,tge,"Second Thread");
        Thread t3=new Thread(tg,tge,"Third Thread");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(tg.getName());
        tg.list();

    }
}
