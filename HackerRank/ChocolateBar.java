package com.hackerrank;
public class ChocolateBar {
    public static void main(String[] args) {
        // Hardcoded inputs
        int n = 5; // Number of chocolate pieces
        int[] pieces = {1, 2, 1, 3, 2}; // Array of chocolate piece values
        int d = 3; // Length of the segment
        int m = 2; // Target sum of the segment
        
        // Calculate the number of segments with sum equal to m
        int count = birthday(pieces, d, m);
        
        // Output the result
        System.out.println(count);
    }

    public static int birthday(int[] s, int d, int m) {
        int count = 0;
        int currentSum = 0;
        
        // Check if the length of the segment is greater than the array length
        if (m > s.length) {
            return 0;
        }

        // Compute the sum of the first segment of length m
        for (int i = 0; i < m; i++) {
            currentSum += s[i];
        }

        // Check if the sum of the first segment equals d
        if (currentSum == d) {
            count++;
        }

        // Slide the window across the array
        for (int i = m; i < s.length; i++) {
            currentSum += s[i] - s[i - m];
            if (currentSum == d) {
                count++;
            }
        }

        return count;
    }
}


