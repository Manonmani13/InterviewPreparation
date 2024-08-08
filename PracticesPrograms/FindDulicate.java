package com.test;

import java.util.HashMap;
import java.util.Map;

public class FindDulicate {
	public static void main(String[] args) {
		String m="manonmani";
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for(char c:m.toCharArray())
		{
			map.put(c,map.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Character, Integer> ke:map.entrySet())
		{
			if(ke.getValue()>1)
			{
				System.out.println(ke.getKey());
			}
		}
	}

}
