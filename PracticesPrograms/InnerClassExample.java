package com.practices.javapractices;

public class InnerClassExample {
    int x=10;
    private class InnerClass{
        int y=10;
    }

    public static void main(String[] args) {
        InnerClassExample inner=new InnerClassExample();
        InnerClassExample.InnerClass innerClass=inner.new InnerClass();
        System.out.println(inner.x+innerClass.y);
    }
}
