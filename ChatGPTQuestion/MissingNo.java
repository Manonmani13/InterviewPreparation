package com.chatgpt;

public class MissingNo {
	 public static int findMissingNumber(int[] nums) {
	        int n = nums.length;
	        int total = (n * (n + 1)) / 2; 
	        int sum = 0;
	        for (int num : nums) {
	            sum += num;
	        }
	        return total - sum;
	    }

	    public static void main(String[] args) {
	        int[] nums = {0, 1, 2, 4}; // Example
	        System.out.println("Missing number is " + findMissingNumber(nums));
	    }

}
