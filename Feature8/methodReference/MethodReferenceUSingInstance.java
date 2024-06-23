package com.methodReference;

import java.lang.reflect.Method;

public class MethodReferenceUSingInstance {
    public void saySomething()
    {
        System.out.println("Hello this is static method");
    }

    public static void main(String[] args) {
        MethodReferenceUSingInstance ins=new MethodReferenceUSingInstance();
        Sayable say=ins::saySomething;
        say.say();
    }
}
