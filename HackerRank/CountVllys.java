package com.hackerrank;

public class CountVllys {
	public static void main(String[] args) {
		String steps="UDDDUDUU";
		int level=0,valley=0;
		for(char c:steps.toCharArray())
		{
			if(c=='U')
			{
				level++;
			}
			else if(c=='D')
			{
				level--;
			}
			if(level==0&& c=='U')
			{
				valley++;
			}
		}
			
		System.out.println(valley);
	}

}
