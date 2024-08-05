package com.test;

public class MissingNumber {
	public static void main(String[] args) {
		int n[]= {1,2,4,5,6};
		int len=n.length+1;
		int execptedNo=len*(len+1)/2;
		System.out.println(execptedNo);
		int actual=0;
		for(int no:n)
		{
			actual+=no;
		}
		System.out.println(actual);

		System.out.println(execptedNo-actual);
	}

}
