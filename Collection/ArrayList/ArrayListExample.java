package com.collection.ArrayList;

import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        for(int i:arr)
            System.out.println(i);
        Arrays.sort(arr);
        System.out.println("After sorting ");
        for(int i:arr)
            System.out.println(i);
    }
}
