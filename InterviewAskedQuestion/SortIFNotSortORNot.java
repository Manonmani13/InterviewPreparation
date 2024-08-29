package com.test;

import java.util.Arrays;

public class SortIFNotSortORNot {
	public static void main(String[] args) {
		int n[]= {2,1,4,5,3};
		int sorted[]=sortAndReturn(n);
		for(int sort:sorted)
		System.out.println(sort);
		
	}
	public static boolean sortArray(int n[])
	{
		for(int i=0;i<n.length;i++)
		{
			if(n[i]>n[i+1])
			{
				return false;
			}
		}
		return true;
		
	}
	public static int[] sortAndReturn(int n[])
	{
		if(sortArray(n))
		{
			return n;
		}
		else
		{
			int sort[]=n.clone();
			Arrays.sort(sort);
			return sort;
		}
	}

}
