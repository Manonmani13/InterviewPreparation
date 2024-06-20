package com.leedcode;

public class ReverseIntegers {
    public static void main(String[] args) {
        int x=-123,d=0;
        int  no=0;
        while(x!=0)
        {
            d=x%10;
            if (no > Integer.MAX_VALUE / 10 || (no == Integer.MAX_VALUE / 10 && d > 7)) {
                no=no+0;
            }
            if (no < Integer.MIN_VALUE / 10 || (no == Integer.MIN_VALUE / 10 && d < -8)) {
                no=no+0;

            }
            no=no*10+(d);

            x=x/10;
        }
        System.out.println(no);
    }
}

