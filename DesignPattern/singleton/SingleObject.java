package com.proretention.scrm.Integration.singleton;

public class SingleObject {
    public static SingleObject obj=new SingleObject();
    private SingleObject(){}
    public static SingleObject getInstance()
    {
        return obj;
    }
    public void Show()
    {
        System.out.println("Sample single object");
    }


}
