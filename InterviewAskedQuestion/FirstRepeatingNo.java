package com.test;

public class FirstRepeatingNo {
	public static void main(String[] args) {
		int n[]= {4,5,6,5,7,3};
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					System.out.println(n[i]);
					break;
				}
			}
		}
		
	}

}
