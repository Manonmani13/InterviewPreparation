package com.Thread;

public class JoinWithInterupt {
    public static void main(String[] args) {
        try{
            ABC intr=new ABC();
            intr.threadToInterrupt=Thread.currentThread();
            intr.start();
            intr.join();
        }catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }


    }
}
class ABC extends Thread
{
    Thread threadToInterrupt;
    public void run()
    {
        threadToInterrupt.interrupt();
    }
}