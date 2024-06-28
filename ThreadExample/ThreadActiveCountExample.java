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

    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("Parent Thread ");
        ThreadActiveCountExample thac=new ThreadActiveCountExample("first",tg);
        ThreadActiveCountExample thac2=new ThreadActiveCountExample("second",tg);

        System.out.println(tg.activeCount());

    }
}
