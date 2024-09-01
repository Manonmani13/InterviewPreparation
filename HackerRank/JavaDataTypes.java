package com.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaDataTypes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		 for (int i = 0; i < t; i++) {
			 try {
	                // Read the number as a String
	                String input = sc.nextLine();
	                BigInteger number = new BigInteger(input);

	                System.out.println(number + " can be fitted in:");

	                // Check for byte range
	                if (number.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 && number.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
	                    System.out.println("* byte");
	                }
	                // Check for short range
	                if (number.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 && number.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
	                    System.out.println("* short");
	                }
	                // Check for int range
	                if (number.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && number.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
	                    System.out.println("* int");
	                }
	                // Check for long range
	                if (number.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && number.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
	                    System.out.println("* long");
	                }
	            } catch (Exception e) {
	                // If an exception occurs, it means the number is out of range for long
	                System.out.println(sc.nextLine() + " can't be fitted anywhere.");
	            }


		 }
	}

}
