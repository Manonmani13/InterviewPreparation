package com.greekforgreeks;

public class MissingNo {
	public static void main(String[] args) {
		int no[]= {1,2,4,5};
		int n=no.length+1;
		 int expectedSum = n * (n + 1) / 2;
	        
	        // Calculate the actual sum of the given array elements
	        int actualSum = 0;
	        for (int num : no) {
	            actualSum += num;
	        }
	        
		System.out.println(expectedSum-actualSum);
	}

}
