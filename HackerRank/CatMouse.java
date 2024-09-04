package com.hackerrank;

import java.util.Scanner;

public class CatMouse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			int catA=sc.nextInt();
			int catB=sc.nextInt();
			int mouse=sc.nextInt();
			int distanceCatA=Math.max(catA, mouse);
			int distanceCatB=Math.max(catB, mouse);
			if(distanceCatA<distanceCatB)
				System.out.println("Cat A");
			else if(distanceCatB<distanceCatA)
				System.err.println("Cat B");
			else
				System.out.println("Mouse C");
		}
	}
}
