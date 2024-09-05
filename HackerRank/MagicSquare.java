package com.hackerrank;

import java.util.Arrays;
import java.util.List;

public class MagicSquare {
	public static void main(String[] args) {
		List<List<Integer>> s = Arrays.asList(
	            Arrays.asList(4, 9, 2),
	            Arrays.asList(3, 5, 7),
	            Arrays.asList(8, 1, 5)
	        );

	        int result = formingMagicSquare(s);

	        System.out.println(result);
	}
	public static int formingMagicSquare(List<List<Integer>> s) {
	    // Write your code here
	int[][][] MAGIC_SQUARES = {
	            { {8, 1, 6}, {3, 5, 7}, {4, 9, 2} },
	            { {6, 1, 8}, {7, 5, 3}, {2, 9, 4} },
	            { {4, 9, 2}, {3, 5, 7}, {8, 1, 6} },
	            { {2, 9, 4}, {7, 5, 3}, {6, 1, 8} },
	            { {8, 3, 4}, {1, 5, 9}, {6, 7, 2} },
	            { {4, 3, 8}, {9, 5, 1}, {2, 7, 6} },
	            { {6, 7, 2}, {1, 5, 9}, {8, 3, 4} },
	            { {2, 7, 6}, {9, 5, 1}, {4, 3, 8} }
	        };
	                int[][] input = new int[3][3];
	        for(int i=0;i<3;i++)
	        {
	            for(int j=0;j<3;j++)
	            {
	                input[i][j]=s.get(i).get(j);
	            }
	        }
	        int minCost=Integer.MAX_VALUE;
	        for(int[][] magic:MAGIC_SQUARES)
	        {
	            int cost=0;
	            for(int i=0;i<3;i++)
	            {
	                 for(int j=0;j<3;j++)
	            {
	                cost+=Math.abs(input[i][j]-magic[i][j]);
	            }
	            }
	                        minCost = Math.min(minCost, cost);

	        }
	        return minCost;
	        
	    }
}
