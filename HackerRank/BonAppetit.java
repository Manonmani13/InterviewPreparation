package com.hackerrank;

import java.util.Scanner;

public class BonAppetit {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Read the number of items and the index of the item Anna didn't eat
	        int n = scanner.nextInt();
	        int k = scanner.nextInt();

	        // Read the costs of the items
	        int[] costs = new int[n];
	        for (int i = 0; i < n; i++) {
	            costs[i] = scanner.nextInt();
	        }

	        // Read the amount Anna was charged
	        int chargedAmount = scanner.nextInt();

	        // Calculate the total cost of shared items
	        int totalSharedCost = 0;
	        for (int i = 0; i < n; i++) {
	            if (i != k) {
	                totalSharedCost += costs[i];
	            }
	        }

	        // Calculate the correct share
	        int correctShare = totalSharedCost / 2;

	        // Determine if there was an overcharge
	        if (chargedAmount == correctShare) {
	            System.out.println("Bon Appetit");
	        } else {
	            System.out.println(chargedAmount - correctShare);
	        }

	        scanner.close();
		
	}

}
