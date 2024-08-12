package com.hackerrank;

import java.util.Scanner;

public class CompareTripulates {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read Alice's ratings
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }

        // Read Bob's ratings
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            b[i] = scanner.nextInt();
        }

        // Calculate the comparison points
        int[] result = compareTriplets(a, b);

        // Print the result
        System.out.println(result[0] + " " + result[1]);

        scanner.close();
    }

    public static int[] compareTriplets(int[] a, int[] b) {
        int aliceScore = 0;
        int bobScore = 0;

        // Compare each category
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                aliceScore++;
            } else if (a[i] < b[i]) {
                bobScore++;
            }
        }

        return new int[] { aliceScore, bobScore };
    }
}
