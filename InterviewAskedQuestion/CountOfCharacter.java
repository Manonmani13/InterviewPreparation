package com.test;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharacter {
	public static void main(String[] args) {
		String name="manonmani";
		Map<Character,Integer> no=new HashMap();
		for(char c:name.toCharArray())
		{
			if(no.containsKey(c))
			{
				no.put(c, no.get(c)+1);
			}
			else
			{
				no.put(c,1);

			}
		}
		System.out.println(no);
	}

}
