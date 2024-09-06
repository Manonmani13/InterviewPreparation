package com.greekforgreeks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
	public static void main(String[] args) {
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        int n=arr1.length;
        List<Integer> leaders = new ArrayList();
        if(n==0)System.out.println(leaders);
        int max=arr1[n-1];
        leaders.add(max);
        for(int i=n-2;i>=0;i--)
        {
        	if(arr1[i]>=max)
        	{
        		leaders.add(arr1[i]);
        		max=arr1[i];
        	}
        }
        Collections.reverse(leaders);
        for(int a:leaders)
        {
        	System.out.println(a);
        }
	}

}
