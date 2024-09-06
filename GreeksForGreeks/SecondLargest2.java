package com.greekforgreeks;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[]= {12, 35, 1, 10, 34, 1};
		System.out.println(findSecondLargest(arr));
	}
	 public static int findSecondLargest(int[] arr) {
	        if (arr.length < 2) {
	            return -1; // Not enough elements to find the second largest
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num < largest) {
	                secondLargest = num;
	            }
	        }

	        // If secondLargest is still Integer.MIN_VALUE, it means there was no valid second largest element
	        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
	    }

}
