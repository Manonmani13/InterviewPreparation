package com.test;

public class SumHighIndex {
public static void main(String[] args) {
	int n[]= {10,5,2,7,1,9};
	int N=15;
	int sum=0;
	int count=1;
	for(int i=0;i<n.length;i++)
	{
		for(int j=i+1;j<n.length;j++)
		{
			sum+=n[i]+n[j]; 
			count++;
			if(N==sum)
			{
				System.out.println(count);
			}
			if(sum>N)
			{
				sum=0;
				count=1;
			}
		}
		sum=0;
		count=1;
	}
}
}
