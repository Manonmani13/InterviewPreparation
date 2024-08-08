package com.test;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1="listen",str2="silnte";
		char c1[]=str1.toCharArray();
		char c2[]=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2))
		{
			System.out.println("equal");
		}

	}

}
