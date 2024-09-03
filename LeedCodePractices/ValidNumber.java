	package com.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNumber {
		public static void main(String[] args) {
			String s="-0.1";
//			for(int i=0;i<s.length();i++)
//			{
//				if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&& s.charAt(i)<='z')
//				{
//					System.out.println(false);
//				}
//				else if(s.charAt(i)>='0'&& s.charAt(i)<='9')
//				{
//					System.out.println(true);
//				}
//				else
//				{
//					System.out.println(false);
//				}
//				
//			}
			String regex = "^[+-]?((\\d+\\.\\d*)|(\\.\\d+)|(\\d+))([eE][+-]?\\d+)?$";
	        
	        // Compile the regex pattern
	        Pattern pattern = Pattern.compile(regex);
	        
	        // Match the input string against the pattern
	        Matcher matcher = pattern.matcher(s);
	        
	       System.out.println(matcher.matches());
		}
	
	}
