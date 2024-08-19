package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNo {
	public static void main(String[] args) {
		int number=9274513;
		String secondLargestNo=findSecondLargestDigits(number);
		System.out.println(secondLargestNo);
	}

	private static String findSecondLargestDigits(int number) {
		// TODO Auto-generated method stub

        List<String> permutations = new ArrayList<>();
        String numberStr = String.valueOf(number);
        char[] digits = numberStr.toCharArray();
        
        // Generate all permutations
        permute(digits, 0, permutations);

        // Remove duplicates and sort permutations in descending order
        Collections.sort(permutations, Collections.reverseOrder());

        // Find the second largest permutation
        if (permutations.size() < 2) {
            return "No second largest permutation exists.";
        }
        return permutations.get(1); 
	}
	private static void permute(char[] arr, int start, List<String> permutations) {
        if (start == arr.length - 1) {
            permutations.add(new String(arr));
        } else {
            for (int i = start; i < arr.length; i++) {
                swap(arr, start, i);
                permute(arr, start + 1, permutations);
                swap(arr, start, i); // Backtrack
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
