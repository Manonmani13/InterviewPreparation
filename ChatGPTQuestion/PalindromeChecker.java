package com.test;

public class PalindromeChecker {
	public static void main(String[] args) {
		System.out.println(checkBoolean("racecar"));
	}
	public static  boolean checkBoolean(String s)
	{
		int left=0;
		int right=s.length()-1;
		while(left<right)
		{
			if(s.charAt(left)!=s.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
