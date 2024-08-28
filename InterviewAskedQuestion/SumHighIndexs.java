package com.test;

public class SumHighIndexs {
	 public static void main(String[] args) {
		 int n[] = {10, 5, 1, 7, 1,1, 9};
	        int N = 15;
	        int highestEndIndex = -1; // Variable to store the highest end index of a valid subarray
	        int maxLength = 0; // Variable to store the length of the longest subarray

	        for (int start = 0; start < n.length; start++) {
	            int sum = 0;
	            for (int end = start; end < n.length; end++) {
	                sum += n[end];
	                if (sum == N) {
	                    // Update highestEndIndex and maxLength if we find a longer subarray
	                    if (end - start + 1 > maxLength) {
	                        maxLength = end - start + 1;
	                        highestEndIndex = end;
	                    }
	                }
	            }
	        }

	        // Output the highest index where the longest subarray with the target sum ends
	        if (highestEndIndex != -1) {
	            System.out.println("The highest index of the longest subarray with sum " + N + " is: " + highestEndIndex);
	        } else {
	            System.out.println("No subarray found with sum " + N);
	        }
	    }
}
