package com.practices.design;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        singleton.displayMessages();
        singleton2.displayMessages();
    }
}
