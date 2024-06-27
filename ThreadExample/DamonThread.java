package com.proretention.scrm.calendar;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DamonThread extends Thread {
public void run()
{
    if(Thread.currentThread().isDaemon())
    {
        System.out.println("deamon thread work");
    }
    else {
        System.out.println("normal thread");
    }
}



    public static void main(String[] args) {
        DamonThread th=new DamonThread();
        th.setDaemon(true);
        th.start();
        DamonThread th2=new DamonThread();
        th2.start();
    }
}
