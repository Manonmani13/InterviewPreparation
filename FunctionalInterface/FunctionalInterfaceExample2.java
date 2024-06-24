package com.FunctionalInterface;

public class FunctionalInterfaceExample2 {
    public static void main(String[] args) {
        sayable say=(message)-> System.out.println("Hello "+message);
        say.say("Manonmani");
    }
}
