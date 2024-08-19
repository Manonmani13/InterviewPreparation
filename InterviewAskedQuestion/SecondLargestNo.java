package com.test;

import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNo {
	public static void main(String[] args) {
		int number=9274513;
		int secondLargestNo=findSecondLargestDigits(number);
		System.out.println(secondLargestNo);
	}

	private static int findSecondLargestDigits(int number) {
		// TODO Auto-generated method stub
		Set<Integer> set=new TreeSet<Integer>();
		while(number>0)
		{
			int digit=number%10;
			set.add(digit);
			number/=10;
			
		}
		if (set.size() < 2) {
            return -1;
        }
		Integer largest=((TreeSet<Integer>)set).last();
        Integer secondLargest = ((TreeSet<Integer>) set).lower(largest);
		return secondLargest;
	}

}
