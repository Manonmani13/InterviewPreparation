package com.test;

import java.util.HashMap;
import java.util.Map;

public class Uniquecharacters {
	public static void main(String[] args) {
		String name="Manonmani";
		Map<Character,Integer> ch=new HashMap<Character, Integer>();
		for( char c:name.toCharArray())
		{
			ch.put(c, ch.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Character, Integer> na:ch.entrySet())
		{
			if(na.getValue()==1)
			{
				System.out.println(na.getKey());
			}
		}
	}

}
