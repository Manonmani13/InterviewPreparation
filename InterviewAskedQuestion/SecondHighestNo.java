package com.test;

public class SecondHighestNo {
	public static void main(String[] args) {
		int n[]= {1,2,9,3,4,8};
		int high=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
		for(int num:n)
		{
			if(num>high)
			{
				second=high;
				high=num;
			}
			else if(num>second &&second<high )
			{
				second=num;
			}
			
		}
		System.out.println(second);
	}

}
