package com.greekforgreeks;

import java.util.ArrayList;
import java.util.HashMap;

public class IndexFinder {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int s = 12;
      System.out.println(get(arr,n,s));
	}
	public static ArrayList<Integer>  get(int []arr,int n,int s)
	{
        int currentSum=0;

		  ArrayList<Integer> result = new ArrayList<>();
	        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
	       
	        for(int i=0;i<n;i++)
	        {
	        	currentSum+=arr[i];
	        	 if (currentSum == s) {
	                 result.add(1); // 1-based index
	                 result.add(i + 1); // 1-based index
	                return result;
	             }
	             
	             // Check if there is a prefix sum that we can subtract to get the target sum
	             if (prefixSumMap.containsKey(currentSum - s)) {
	                 result.add(prefixSumMap.get(currentSum - s) + 2); // 1-based index
	                 result.add(i + 1); // 1-based index
		                return result;

	             }
	             
	             // Store the current prefix sum in the map
	             prefixSumMap.put(currentSum, i);
	        }
            return result;

	}

}
