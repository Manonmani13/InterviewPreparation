package com.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortIFNotSortORNot2 {
	public static void main(String[] args) {
		int n[]= {2,1,4,5,3};
		int sort[]=sortAndReturn(n);
        Arrays.stream(sort).forEach(System.out::println);


	}
	public static boolean isSorted(int n[])
	{
		return IntStream.range(0, n.length-1).allMatch(i->n[i]<=n[i+1]);
	}

	public static int[] sortAndReturn(int n[])
	{
		return isSorted(n)?n:Arrays.stream(n).sorted().toArray();
	}
}
