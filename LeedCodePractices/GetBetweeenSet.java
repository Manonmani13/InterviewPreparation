package com.hackerrank;

public class GetBetweeenSet {
	public static void main(String[] args) {
		int a[]= {2,3,2,4};
		int b[]= {16,32,96};
		System.out.println(getTotalX(a, b));
		
	}
	public static int getTotalX(int []a,int b[])
	{
		int lcm_a=a[0];
		for(int i=1;i<a.length;i++)
		{
			lcm_a=lcm(lcm_a,a[i]);
		}
		int lcm_b=b[0];
		for(int i=1;i<b.length;i++)
		{
			lcm_b=lcm(lcm_b,b[i]);
		}
        int count = 0;
        for(int x=lcm_a;x<=lcm_b;x+=lcm_a)
        {
        	if(lcm_b%x==0)
        	{
        		count++;
        	}
        }
        return count;
	}
	private static int lcm(int a, int i) {
		// TODO Auto-generated method stub
		return a*(i/gcd(a,i));
	}
	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		while(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
}
