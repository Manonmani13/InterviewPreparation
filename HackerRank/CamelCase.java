package com.hackerrank;

public class CamelCase {
	public static void main(String[] args) {
		int word=1;
		String c="saveChangesInTheEditor";
		for(char ch:c.toCharArray())
		{
			if(Character.isUpperCase(ch))
			{
				word++;
			}
		}
		System.out.println(word);
	}

}
