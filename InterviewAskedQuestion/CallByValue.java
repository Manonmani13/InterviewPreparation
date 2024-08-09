package com.test;

public class CallByValue {
	static void increment(int a)
	{
		a++;
	}
	public static void main(String[] args) {
		int a=10;
		increment(a);
		System.out.println(a);
		// call by value is nothing but pass value copy to method
		
	}

}
