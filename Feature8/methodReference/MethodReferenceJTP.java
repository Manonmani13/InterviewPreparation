package com.methodReference;
interface Sayable{
    void say();
}
public class MethodReferenceJTP {
    public static void saySomething()
    {
        System.out.println("Hello Check ");
    }

    public static void main(String[] args) {
        Sayable say=MethodReferenceJTP::saySomething;
        say.say();
    }
}
