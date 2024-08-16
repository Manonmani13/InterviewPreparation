package com.hackerrank;

import java.util.Stack;

public class SuperReduceString {
	public static void main(String[] args) {
		String s="aaabccddd";
		Stack<Character> st=new Stack<Character>();
		for(char c:s.toCharArray())
		{
			if(!st.isEmpty()&& st.peek()==c)
			{
				st.pop();
			}
			else
			{
				st.push(c);
			}
			
		}
		StringBuffer result=new StringBuffer();
		for(char c:st)
		{
			result.append(c);
		}
	System.out.println(result.toString());
	}

}
