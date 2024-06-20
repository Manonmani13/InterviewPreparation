package com.leedcode;

public class ReverseIntegers {
    public static void main(String[] args) {
        int x=123,d=0;
        int  no=0;
        while(x!=0)
        {
            d=x%10;
            no=no*10+(d);
            x=x/10;
        }
        System.out.println(no);
    }
}
