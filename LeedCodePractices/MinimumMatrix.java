package com.practices.leedconde;

import java.util.ArrayList;
import java.util.List;

public class MinimumMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        List<Integer> result = new ArrayList<>();

        // Step 1: Determine minimum in each row
        int[] rowMin = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            rowMin[i] = min;
        }

        // Step 2: Determine maximum in each column
        int[] colMax = new int[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            colMax[j] = max;
        }

        // Step 3: Find lucky numbers
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }

        System.out.println(result);
    }
}
