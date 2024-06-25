package com.Thread;

public class DirectCallRun extends  Thread{
    public void run()
    {
        System.out.println("Run method");
    }

    public static void main(String[] args) {
        DirectCallRun cal=new DirectCallRun();
        cal.run();
    }

}
