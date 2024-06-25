package com.Thread;

public class JoinMethod1 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<5;i++)
        {
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JoinMethod1 jm=new JoinMethod1();
        jm.start();
        try
        {
            jm.join();
        }
        catch (Exception e){}
    }
}
