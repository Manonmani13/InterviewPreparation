package com.hackerrank;

public class MaxMinSum {
	public static void main(String[] args) {
		int n[]= {1,2,3,4,5};
		int sum=0;
		int num[]=new int[n.length];
	
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n.length;j++)
			{
				if(i!=j)
					sum+=n[j];
			}
//			System.out.println(sum);
			num[i]=sum;
			sum=0;
		}
		int min=num[0],max=num[0];
		for(int nu:num)
		{
			if(nu<min)min=nu;
			else if(nu>max) max=nu;
			System.out.println(nu);
		}
		System.out.println(min +" "+ max);
	}

}
