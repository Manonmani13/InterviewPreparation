package com.leetcode;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int no[]= {0,0,1,1,1,2,2,3,3,4};
		List<Integer> ul=IntStream.of(no).boxed().distinct().collect(Collectors.toList());
		for(int i=0;i<ul.size();i++)
		{
			no[i]=ul.get(i);
		}
		for(int u:ul)
		{
			System.out.println(u);
		}
	}
		

}