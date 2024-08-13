package com.greekforgreeks;

public class SquareRoot {
	public static void main(String[] args) {
		int n=10;
		int i=0;
		while(i*i<=n)
		{
			System.out.println(i*i);

			i++;
		}
		System.out.println(i-1);
	}
}
