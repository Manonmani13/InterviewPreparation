package com.practices.leedconde;

public class ArrayOdd {
    public static void main(String[] args) {
        int array[]={2,4,4,1};
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2!=0)
            {
                count++;
            }
        }
        if(count>3)
        {
            System.out.println(true);
        }
        else
            System.out.println(false);
    }
}
