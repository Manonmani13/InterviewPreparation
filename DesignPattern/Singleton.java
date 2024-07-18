package com.practices.design;

public class Singleton {
    private static Singleton singleton;

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if(singleton==null)
            singleton=new Singleton();
        return singleton;
    }
public void displayMessages()
{
    System.out.println("I have called using singleton object");
}


}
