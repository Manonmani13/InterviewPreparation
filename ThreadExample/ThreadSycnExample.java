package com.proretention.scrm.calendar;

public class ThreadSycnExample {
    public static void main(String[] args) throws Exception {
        Table t=new Table();
        Thread1 r=new Thread1(t);
        Thread2 r2=new Thread2(t);
        r.start();
        r2.start();
   }
}
class Table{
    public void printTables(int n)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(n*i);
        }
    }

}
class Thread1 extends Thread
{
    Table t;
    Thread1(Table t)
    {
        this.t=t;
    }

    @Override
    public void run() {
        t.printTables(3);
    }
}
class Thread2 extends Thread
{
    Table t;
    Thread2(Table t)
    {
        this.t=t;
    }

    @Override
    public void run() {
        t.printTables(5);
    }
}