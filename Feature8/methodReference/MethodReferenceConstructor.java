package com.methodReference;
interface Message{
    MethodReferenceConstructor getMessage(String message);
}
public class MethodReferenceConstructor {
    MethodReferenceConstructor(String message)
    {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Message  cons=MethodReferenceConstructor::new;
        cons.getMessage("Hello Mano");

    }
}
