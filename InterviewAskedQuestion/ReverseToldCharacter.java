package com.test;

public class ReverseToldCharacter {
	public static void main(String[] args) {
		String name="abcdefg";
		int k=2;
		String sublit=name.substring(0,k);
		String newString="";
		for(int i=sublit.length()-1;i>=0;i--)
		{
			newString+=sublit.charAt(i);
		}
		newString+=name.substring(k);
		System.out.println(newString);
		
	}

}
