package com.test;

public class OTPConfirmation {
	public static void main(String[] args) {
		int n=1234;
		int otp=1;
		while(n!=0)
		{
			int d=n%10;
			otp*=d;
			n/=10;
			
		}
		System.out.println(otp);
	}

}
