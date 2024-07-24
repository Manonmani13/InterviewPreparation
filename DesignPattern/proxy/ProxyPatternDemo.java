package com.practices.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image im=new ProxyImage("test.jpg");
        im.display();
        im.display();
    }
}
