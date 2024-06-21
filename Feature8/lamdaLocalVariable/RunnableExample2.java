package com.feature8.lamda;
class ThreadDemo implements  Runnable{

    @Override
    public void run() {
        System.out.println("Run method Called ....");
    }
}

public class RunnableExample2 {
    public static void main(String[] args) {
        Thread thread=new Thread(new ThreadDemo());
        thread.start();
        Runnable runnable=()->{
            System.out.println("run method called using  lamda");
        };
        Thread thread1=new Thread(runnable);
        thread1.start();


    }
}
