package com.proretention.scrm.calendar;

public class MultiTasking  extends  Thread{
    public void run()
    {
        System.out.println("studown task");
    }

    public static void main(String[] args) {
            MultiTasking mt=new MultiTasking();
            MultiTasking t2=new MultiTasking();
            mt.start();
            t2.start();
    }

}
