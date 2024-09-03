package com.greekforgreeks;

public class MinJump {
	public static void main(String[] args) {
		int n[]= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int len=n.length;
		if(len<=1)
		{
			System.out.println(0);
		}
		if(n[0]==0)
			System.out.println(-1);
		int jumps=0,current=0,farethest=0;
		 for (int i = 0; i < len- 1; i++) {
			 farethest = Math.max(farethest, i + n[i]);
			 if (i == current) {
	                jumps++;
	                current = farethest;

	                // If the current end can reach or exceed the last index, return the jumps
	                if (current >= len- 1) {
	                   System.out.println(jumps);
	                }
	            }
		 }
	}

}
