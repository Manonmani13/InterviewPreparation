package com.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesMerchant {
	public static void main(String[] args) {
		List<Integer> n=Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
		Map<Integer, Integer> m=new HashMap<Integer, Integer>();
		for(int no:n)
		{
			m.put(no, m.getOrDefault(no, 0)+1);
			
		}
		int count=0;
		for(int pair:m.values())
		{
			count+=pair/2;
		}
		System.out.println(count);
		
	}

}
