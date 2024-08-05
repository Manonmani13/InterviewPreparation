package com.test;

import java.util.Arrays;
import java.util.List;

public class CountOFList {
	public static void main(String[] args) {
		List<String> ls=Arrays.asList("1","2","3","4");
		int sum=0;
		for(String s:ls)
		{
			sum+=Long.valueOf(s);
			
		}
		System.out.println(sum);
	}

}
