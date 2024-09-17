package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ClaimbingLader {
	 public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		    // Write your code here
		        List<Integer> uniqueRanks = new ArrayList();
		        for(int score:ranked)
		        {
		            if(uniqueRanks.isEmpty()||
		            uniqueRanks.get(uniqueRanks.size() - 1) != score) {
		                                uniqueRanks.add(score);

		            }
		            
		        }
		                List<Integer> result = new ArrayList<>();
		        int rankIndex = uniqueRanks.size() - 1;
		for (int pScore : player) {
		            while (rankIndex >= 0 && pScore >= uniqueRanks.get(rankIndex)) {
		                rankIndex--;
		            }
		            result.add(rankIndex + 2); // rankIndex + 1 is the rank for the player
		        }

		        return result;
		    }
	 public static void main(String[] args) {
		 List<Integer> ls=new ArrayList<Integer>();
		 ls.add(100);
		 ls.add(90);
		 ls.add(90);
		 ls.add(80);
		 List<Integer> ls1=new ArrayList<Integer>();
		 ls1.add(70);
		 ls1.add(80);
		 ls1.add(105);
		 System.out.println(climbingLeaderboard(ls,ls1));
	}
}
