package com.leetcode;

public class NumberComponent {
	public static void main(String[] args) {
		int  num1=5;
		int num2=1;
		System.out.println(findComponent(num2));
		
	}
	public static int findComponent(int num)
	{
		int numberOfBits=Integer.toBinaryString(num).length();
		System.out.println(numberOfBits);
		int bitmask=(1<<numberOfBits)-1;
		System.out.println(bitmask);
		System.out.println(num^bitmask);
		return num^bitmask;
	}

}
