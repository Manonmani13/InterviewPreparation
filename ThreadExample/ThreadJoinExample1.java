package com.Thread;

public class ThreadJoinExample1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<2;i++){
            try{
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName());
            }
            catch (InterruptedException e)
            {
                System.out.println("Exception "+e.getMessage());
            }
        }
    }
}
