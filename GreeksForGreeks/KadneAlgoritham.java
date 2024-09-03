package com.hackerrank;

public class KadneAlgoritham {
	public static void main(String[] args) {
		int arr[]= {-1, -2, -3, -4};
		int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update maxEndingHere
            if (arr[i] > maxEndingHere + arr[i]) {
                maxEndingHere = arr[i];
            } else {
                maxEndingHere = maxEndingHere + arr[i];
            }

            // Update maxSoFar
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
        }

        System.out.println(maxSoFar);
	}

}
