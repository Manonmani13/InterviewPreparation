package com.leetcode;

import java.util.Scanner;

public class HundredRace {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // Read the first line of input
	        int numHurdles = scanner.nextInt();
	        int maxJumpHeight = scanner.nextInt();
	        
	        // Read the second line of input for hurdle heights
	        int[] hurdleHeights = new int[numHurdles];
	        for (int i = 0; i < numHurdles; i++) {
	            hurdleHeights[i] = scanner.nextInt();
	        }
	        
	        // Find the maximum height of the hurdles
	        int maxHurdleHeight = hurdleHeights[0];
	        for (int i = 1; i < numHurdles; i++) {
	            if (hurdleHeights[i] > maxHurdleHeight) {
	                maxHurdleHeight = hurdleHeights[i];
	            }
	        }
	        
	        // Calculate the additional height needed to jump over the highest hurdle
	        int additionalHeight = Math.max(0, maxHurdleHeight - maxJumpHeight);
	        
	        // Print the result
	        System.out.println(additionalHeight);
	        
	        // Close the scanner
	        scanner.close();
	}

}
