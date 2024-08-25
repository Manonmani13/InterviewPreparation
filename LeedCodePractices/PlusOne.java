package com.leetcode;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
        
                digits[i]++;
                return digits;
            }
        
            digits[i] = 0;
        }
        

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        
        return newDigits;

    }
    public static void main(String[] args) {
		int d[]= {1,2,3};
		int response[]=plusOne(d);
		for(int r:response)
		System.out.println(r);
	}
}
