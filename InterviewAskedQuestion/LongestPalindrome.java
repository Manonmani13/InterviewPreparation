package com.test;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "babad"; // Example input
        String result = longestPalindrome(s);
        System.out.println("The longest palindromic substring is: " + result);
    }

    private static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longest="";
        for(int i=0;i<s.length();i++)
        {
        	String odd=expand(s, i, i);
        	if(odd.length()>longest.length())
        	{
        		longest=odd;
        	}
        	String even=expand(s, i, i+1);
        	if(even.length()>longest.length())
        	{
        		longest=even;
        	}
        }
        return longest;
    }

    private static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
