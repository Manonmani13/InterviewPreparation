package com.test;

import java.util.HashSet;

public class LongestSubstringNonRepeat {
	public static void main(String[] args) {
		String s="abcabcbb";
		int left=0,maxLength=0;
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			while(set.contains(s.charAt(i)))
			{
				set.remove(s.charAt(i));
			}
			set.add(s.charAt(i));
			maxLength=Math.max(maxLength, i-left+1);
		}
		System.out.println(maxLength);
	}

}
