package com.greekforgreeks;

import java.util.HashMap;
import java.util.Map;

public class SumTwo {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
		int target=12;
		  int n = arr.length;
	        int start = 0;
	        int currentSum = 0;
	        
	        for (int end = 0; end < n; end++) {
	            currentSum += arr[end];
	            
	            // Shrink the window from the left if the current sum exceeds the target
	            while (currentSum > target && start <= end) {
	                currentSum -= arr[start++];
	            }
	            
	            // Check if the current sum equals the target
	            if (currentSum == target) {
	                System.out.println((start + 1) + " " + (end + 1)); // Output in 1-based index
	            }
	        }
	}

}
