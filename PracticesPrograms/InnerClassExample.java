package com.practices.javapractices;

public class InnerClassExample {
    int x=10;
    private class InnerClass{
        int y=10;
    }
     static  class InnerClass2{
        int xy=10;
    }

    public static void main(String[] args) {
        InnerClassExample.InnerClass2 innerClass=new InnerClassExample.InnerClass2();
        InnerClassExample myOuter = new InnerClassExample();
        InnerClassExample.InnerClass myInner = myOuter.new InnerClass();

        System.out.println(innerClass.xy+myOuter.x);
        System.out.println(myInner.y);
    }
}
