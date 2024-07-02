package com.proretention.scrm.calendar;

public class StudownHockExample1 {
    public void run()
    {
        System.out.println("studown task");
    }

    public static void main(String[] args) {
            Runtime ru=Runtime.getRuntime();
            ru.addShutdownHook(new Thread());
        System.out.println("Now main sleeping... press ctrl+c to exit");
        try{
            Thread.sleep(100);
        }
        catch (Exception e ){}
    }

}
