package com.test;

public class Test {
	public static void main(String[] args) {
		int n[]= {2,3,4,5,1,2,3,4,1,2};
		String no="";
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				
				if(n[i]==n[j])
				{
					if(!no.contains(String.valueOf(n[i])))
							{
								no+=n[i];
							}
				}
			}
		}
		System.out.println(no);

	}

}
