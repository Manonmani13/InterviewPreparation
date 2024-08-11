package com.chatgpt;

public class Fibnacci {
	public static void main(String[] args) {
		System.out.println(fibno(7));
		
	}
	public static int fibno(int n)
	{
		if(n<=1)
		{
			return n;
		}
		int a=0,b=1,c;
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return b;
	}

}
