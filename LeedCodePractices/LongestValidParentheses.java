package com.test;

import java.util.Stack;

public class LongestValidParentheses {
public static void main(String[] args) {
	String s="(()()";
	System.out.println(longestValidParentheses(s));
	
}
public static int longestValidParentheses(String s)
{
	Stack<Integer> st=new Stack<Integer>();
	st.push(-1);
	int max=0;
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c=='(')
		{
			st.push(i);
		}
		else if(c==')')
		{
			st.pop();
			if(st.isEmpty())
			{
				st.push(i);
			}
			else
			{
				int leng=i-st.peek();
				max=Math.max(max, leng);
			}
		}
	}
	return max;
}
}
