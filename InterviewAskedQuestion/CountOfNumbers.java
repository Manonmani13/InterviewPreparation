package com.test;

import java.util.HashMap;
import java.util.Map;

public class CountOfNumbers {
	public static void main(String[] args) {
		int no[]= {5,1,2,3,4,5,2,1};
		Map<Integer,Integer> ls=countOfNum(no);
		System.out.println(ls);
		
	}

	private static Map<Integer, Integer> countOfNum(int[] no) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> ls=new HashMap<Integer, Integer>();
		for(int n:no)
		{
			ls.put(n,ls.getOrDefault(n, 0)+1);
		}
		return ls;
	}

}
