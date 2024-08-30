package com.leetcode;

public class CountAndSay {
	public static void main(String[] args) {
		System.out.println(countAndSay(4));
	}
	public static String countAndSay(int n)
	{
			if(n<=0)return"";
			String result="1";
			for(int i=1;i<n;i++)
			{
				result=getNext(result);
			}
			return result;
	}
	private static String getNext(String result) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		int len=result.length();
		int i=0;
		while(i<len)
		{
			char currentCur=result.charAt(i);
			int count=0;
			while(i<len&& result.charAt(i)==currentCur)
			{
				i++;
				count++;
			}
			sb.append(count).append(currentCur);
		}
		return sb.toString();
	}

}
