package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;

public class AscendingOrder {
	public static void main(String[] args) {
		 ArrayList<Integer> arr = new ArrayList<>();
	        arr.add(0);
	        arr.add(2);
	        arr.add(1);
	        arr.add(2);
	        arr.add(0);
	        sort012(arr);

	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
		
	}
	public static void swap(ArrayList<Integer> arr,int i,int j)
	{
		int temp=arr.get(i);
		arr.set(i, arr.get(i));
		arr.set(j,temp);
	}
	public static void sort012(ArrayList<Integer> arr)
	{
		 int low = 0;
	        int mid = 0;
	        int high = arr.size() - 1;

	        while (mid <= high) {
	            if (arr.get(mid) == 0) {
	                // Swap arr[mid] and arr[low], then increment both pointers
	                swap(arr, low, mid);
	                low++;
	                mid++;
	            } else if (arr.get(mid) == 1) {
	                // No swap needed, just move the mid pointer
	                mid++;
	            } else {
	                // Swap arr[mid] and arr[high], then decrement high pointer
	                swap(arr, mid, high);
	                high--;
	            }
	        }
	}
}
