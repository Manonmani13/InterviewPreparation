package com.test;

public class VowelAsUpperConstanctASLower {
	public static void main(String[] args) {
		String name="manonmani";
		String vowel="AEIOUaeiou";
		StringBuffer sb=new StringBuffer();
		for(char c:name.toCharArray())
		{
			if(vowel.indexOf(c)!=-1)
			{
				sb.append(Character.toUpperCase(c));
			}
			else if(Character.isLetter(c))
			{
				sb.append(Character.toLowerCase(c));

			}
			else
			{
				sb.append(c);
	
			}
		}
		System.out.println(sb);
	}

}
