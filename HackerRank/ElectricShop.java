package com.hackerrank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;

public class ElectricShop {
	public static void main(String[] args) {
		int keyboards[]= {40,50,60},drives[]= {5,8,12};
		int budget=60;
		int high=-1;
		for(int i=0;i<keyboards.length;i++)
		{
			for(int j=0;j<drives.length;j++)
			{
				int sum=keyboards[i]+drives[j];
				if(sum<=budget&&sum>=high)
				{
					high=sum;
				}
			
			}
		}
		System.out.println(high);
		
		OptionalInt maxSum = Arrays.stream(keyboards)
	            .flatMap(k -> Arrays.stream(drives)
	                .map(d -> k + d))
	            .filter(sum -> sum <= budget)
	            .max();		
		System.out.println(maxSum);

	}

}
