package com.hackerrank;

public class CandelHeight {
public static void main(String[] args) {
	int n[]= {3 ,2, 1, 3};
	int max=Integer.MIN_VALUE;
	int count=0;
	for(int height:n)
	{
		if(height>max)
		{
			max=height;
			count=1;
		}
		else if(max==height)
		{
			count++;
		}
	}
	System.out.println(count);
}
}
