package com.test;

public class Question2 {
	public static void main(String[] args) {
		int n[]= {20,30,10,20,50,80,20,30,50,20};
		int count=1;
		String no="";
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
				
						++count;
					
				}
			}
			
			if(count>=2) {
			
			System.out.println(n[i]+" "+count/2);

			}
			count=1;
			
			
		}
		
		
	}

}
