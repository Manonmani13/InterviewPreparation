package com.test;

public class ReverseToldCharacter {
	public static void main(String[] args) {
		String name="abcdefg";
		int k=2;
//		String sublit=name.substring(0,k);
//		String newString="";
//		for(int i=sublit.length()-1;i>=0;i--)
//		{
//			newString+=sublit.charAt(i);
//		}
//		newString+=name.substring(k);
//		System.out.println(newString);
		StringBuffer stb=new StringBuffer();
		for(int i=0;i<name.length();i+=2*k)
		{
			StringBuilder sb=new StringBuilder();
			int end=Math.min(i+k, name.length());
			sb.append(name.substring(i, end)).reverse();
			stb.append(sb);
			int nextEnd=Math.min(i+2*k, name.length());
			stb.append(name.substring(end,nextEnd));
		}
		System.out.println(stb);
	}

}
