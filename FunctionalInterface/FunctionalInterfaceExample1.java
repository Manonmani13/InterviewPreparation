package com.FunctionalInterface;

@FunctionalInterface
interface sayable{
    void say(String message);
}
public class FunctionalInterfaceExample1 {
    public static void main(String[] args) {
        sayable s=(message)-> System.out.println("Hello Friends "+message);
        s.say("Welcome To This Site");
    }
}
