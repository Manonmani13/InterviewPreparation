package com.practices.techinicalQuestion;

import java.util.*;

public class SuffleArray {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9};
        Random r=new Random();
        for(int i=0;i<array.length;i++)
        {
            int n=r.nextInt(array.length);
            int t=array[n];
            array[n]=array[i];
            array[i]=t;
        }
        System.out.println(Arrays.toString(array));
    }
}
