package com.hackerrank;

public class BestWorstRecord {
	public static void main(String[] args) {
		int n[]= {3 ,4 ,21 ,36 ,10 ,28 ,35 ,5 ,24 ,42};
		int best=n[0];
		int worst=n[0],bestCount=0,worstCount=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]>best)
			{
				best=n[i];
				bestCount++;
			}
			else if(n[i]<worst)
			{
				worst=n[i];
				worstCount++;
			}
		}
        System.out.println(bestCount + " " + worstCount);

	}

	
}
