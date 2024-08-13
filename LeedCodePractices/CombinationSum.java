package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public static void main(String[] args) {
		int n[]= {10,1,2,7,6,1,5};int target=8;
		 List<List<Integer>> results = combinationSum(n, target);
	        
	        // Print the results
	        for (List<Integer> combination : results) {
	            System.out.println(combination);
	        }
	}
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        findCombinations(candidates, target, 0, new ArrayList<>(), results);
        return results;
    }
	public static void findCombinations(int candidates[],int target,int start,List<Integer> current,List<List<Integer>> results)
	{
		if (target == 0) {
            results.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            
            if (candidates[i] > target) {
                break; // No need to continue if the current number exceeds the target
            }
            
            current.add(candidates[i]);
            findCombinations(candidates, target - candidates[i], i + 1, current, results);
            current.remove(current.size() - 1); // Backtrack
        }
	}

}
