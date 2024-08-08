package com.test;

public class PrimeNo {
	public static void main(String[] args) {
		for(int i=2;i<=100;i++)
		{
			if(isPrime(i))
				System.out.println(i);
		}
	}
	public static boolean isPrime(int num)
	{
		if(num<=1||num%2==0) return false;
		if(num==2) return true;
		for(int i=3;i*i<=num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

}
