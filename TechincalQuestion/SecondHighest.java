package com.practices.javapractices;

public class SecondHighest {
    public static void main(String[] args) {
        int high=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int array[]={2,3,4,5,6,7,9,8,0};
        for(int arr:array)
        {
            if(arr>high)
            {
                second=high;
                high=arr;
            }
            else if(arr>second) {
                second=arr;
            }
        }
        System.out.println(second);
    }
}
