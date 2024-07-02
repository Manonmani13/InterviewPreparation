package com.proretention.scrm.calendar;

public class EvenOrOdd {
    int coutr=1;
    static int NUM;
    public void displayOddNo()
    {
        synchronized (this)
        {
            while(coutr<NUM)
            {
                while(coutr%2==0)
                {
                    try{
                        wait();
                    }
                    catch (Exception e){}
                }
                System.out.println(coutr+" ");
                coutr++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        NUM=20;
        EvenOrOdd eo=new EvenOrOdd();
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
               eo.displayOddNo();
            }
        });
        th1.start();
    }

}
