package com.practices.collections;

public class ThreadTrickyQuestion1 {
    public static void main(String[] args) {

        Thread t=new Thread(new MyRunnable());
        t.run();
    }

}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("This is run");
    }
}
