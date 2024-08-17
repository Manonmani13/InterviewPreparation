package com.hackerrank;

public class NumberLine {
	public static void main(String[] args) {
		int x1=0,v1=2,v2=5,x2=3;
		if(v1==v2)
		{
			if(x1==x2)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			
		}
		if((x1-x2)%(v2-v1)==0&&(x1-x2)/(v2-v1)>=0)
			System.out.println("Yes");
		else
			System.out.println("Noa");
		
	}

}
