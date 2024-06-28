package com.Thread;

public class ThreadActiveCountExample extends  Thread {
    ThreadActiveCountExample(String name,ThreadGroup tg)
    {
        super(tg,name);
        start();
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            try{
                Thread.sleep(5);
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup tg=new ThreadGroup("Parent Thread ");
        ThreadActiveCountExample thac=new ThreadActiveCountExample("first",tg);
        ThreadActiveCountExample thac2=new ThreadActiveCountExample("second",tg);
        ThreadGroup tg2=new ThreadGroup("Child Thread ");
//        thac.join();
//        thac2.join();
        System.out.println(tg.activeCount());
        System.out.println(tg.activeGroupCount());
       Thread gr[]=new Thread[tg.activeCount()];
       int c=tg.enumerate(gr);
       for(int i=0;i<c;i++)
       {
           System.out.println(gr[i].getName());
       }
        System.out.println(tg.getMaxPriority());
        System.out.println(tg.getParent().getName());

    }
}

