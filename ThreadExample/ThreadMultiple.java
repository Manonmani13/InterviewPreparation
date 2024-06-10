package com.practices;

public class ThreadMultiple {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10;i++)
                {
                    if(i%2!=0)
                    System.out.println(i);
                }
            }
        });
        Thread th=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10;i++)
                {
                    if(i%2==0)
                    System.out.println(i);
                }
            }
        });
        t.start();
        th.start();
        Thread t3 =new Thread();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10;i++)
                {
                    System.out.println(i);
                }
            }
        };
        t3.start();

    }
}
