package com.leedcode;

public class ReverseIntegers {
    public static void main(String[] args) {
        int x=1534236469,d=0;
        int  no=0;
//        while(x!=0)
//        {
//            d=x%10;
//            if (no > Integer.MAX_VALUE / 10 || (no == Integer.MAX_VALUE / 10 && d > 7)) {
//                no=no+0;
//            }
//            if (no < Integer.MIN_VALUE / 10 || (no == Integer.MIN_VALUE / 10 && d < -8)) {
//                no=no+0;
//
//            }
//            no=no*10+(d);
//
//            x=x/10;
//        }
//        System.out.println(no);
//        System.out.println(x);
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        int reversed = 0;
        System.out.println(x);
        while (x != 0) {
            int digit = x % 10;
            System.out.println("digit "+digit);
            // Check for overflow before multiplying by 10
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                System.out.println(reversed +" "+Integer.MAX_VALUE);
                return 0; // Return 0 if overflow would occur
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                System.out.println(reversed +" "+Integer.MIN_VALUE);

                return 0; // Return 0 if overflow would occur
            }
            System.out.println(reversed * 10 );
            System.out.println(reversed * 10 +digit);
            reversed = reversed * 10 + digit;
            System.out.println(reversed );
            x = x / 10;
        }
        return reversed;
    }
}

