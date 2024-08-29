package com.hackerrank;

import java.util.Scanner;

public class DivisibleSumPairs {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Read the first line of input
	        int n = scanner.nextInt();
	        int k = scanner.nextInt();

	        // Read the second line of input
	        int[] ar = new int[n];
	        for (int i = 0; i < n; i++) {
	            ar[i] = scanner.nextInt();
	        }

	        // Close the scanner
	        scanner.close();

	        // Compute the number of valid pairs
	        int result = divisibleSumPairs(n, ar, k);

	        // Output the result
	        System.out.println(result);
	}
	public static int divisibleSumPairs(int  n, int [] ar, int k)
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			 for (int j = i + 1; j < n; j++) {
	                if ((ar[i] + ar[j]) % k == 0) {
	                    count++;
	                }
	            }
		}
		return count;
	}

}
