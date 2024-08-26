package com.test;

import java.util.Arrays;


public class PriceCal {
	public static void main(String[] args) {
		int  a[] = {40,43,50};
		int b[] = {30,10,65,60};
        int highestSum = -1;

			int m = 100;
			Arrays.sort(a);
			Arrays.sort(b);
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					int  sum=a[i]+b[j];
					 if (sum <= m && sum > highestSum) {
		                    highestSum = sum;
		                }
					
				}
			}
			 if (highestSum != -1) {
		            System.out.println("Highest sum within range: " + highestSum);
		        } else {
		            System.out.println("No sum within the range.");
		        }
	}

}
