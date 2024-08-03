package com.test;

import java.util.Arrays;

public class MEmoryStack {
	public static void main(String[] args) {
		int a=10;
		int b=a;
		System.out.println(a+" "+b);
		int zig[]=new int[2];
		int zag[]=zig;
		System.out.println(zag);
		System.out.println(zig);
		zig[1]=4;
		System.out.println(Arrays.toString(zig));
		System.out.println(Arrays.toString(zag));
		
		
	}

}
