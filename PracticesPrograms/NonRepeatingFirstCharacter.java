package com.test;

import java.util.HashMap;

public class NonRepeatingFirstCharacter {
	public static void main(String[] args) {
		String name="manonmani";
		HashMap<Character, Integer> count=new HashMap<Character, Integer>();
		for(char c:name.toCharArray())
		{
			count.put(c,count.getOrDefault(c,0)+1);
		}
		for(char c:name.toCharArray())
		{
			if(count.get(c)==1)
			{
				System.out.println(c);
				break;
			}
		}
	}

}
