package com.proretention.scrm.calendar;

import freemarker.template.SimpleDate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
       Runnable r=new Task("Task 1");
        ExecutorService pl= Executors.newFixedThreadPool(3);
        pl.execute(r);

    }
}
class Task implements  Runnable{

    String taskName;
    public Task(String task){
        taskName=task;
    }
    @Override
    public void run() {
        for(int i=0;i<=10;i++)
        {
           Date d=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
            System.out.println(sdf.format(d));
            try {
                Thread.sleep(1000);
                System.out.println(taskName + " is complete.");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
