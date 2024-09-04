	package com.leetcode;
	
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.stream.Collector;
	import java.util.stream.Collectors;
	import java.util.stream.IntStream;
	
	public class RemoveDuplicates {
		public static void main(String[] args) {
			int no[]= {0,0,1,1,1,2,2,3,3,4};
			List<Integer> ul=IntStream.of(no).boxed().distinct().collect(Collectors.toList());
	//		for(int i=0;i<ul.size();i++)
	//		{
	//			no[i]=ul.get(i);
	//		}
	//		for(int u:ul)
	//		{
	//			System.out.println(u);
	//		}
		Map<Integer,Integer> c=new HashMap();
		for(int i:no)
		{
			c.put(i, c.getOrDefault(i, 0)+1);
		}
		int index = 0;
        for (int key : c.keySet()) {
            no[index++] = key;
        }
        System.out.println(c.size());
			
		 
		}
			
	
	}