package com.leetcode;

public class AddBinary {
	public static void main(String[] args) {
		String a="11",b="1";
		StringBuilder sbA=new StringBuilder(a).reverse();
		StringBuilder sbB=new StringBuilder(b).reverse();
		StringBuilder result=new StringBuilder();
		int carry = 0;
        int lengthA = sbA.length();
        int lengthB = sbB.length();
        int maxLength = Math.max(lengthA, lengthB);
        for(int i=0;i<maxLength;i++)
        {
        	int bitA=(i<lengthA)?sbA.charAt(i)-'0' :0;
        	int bitB=(i<lengthB)?sbB.charAt(i)-'0' :0;
        	int sum=bitA+bitB+carry;
        	result.append(sum%2);
        	carry=sum/2;
        	

        }
        if (carry > 0) {
            result.append(carry);
        }
        System.out.println(result.reverse().toString());
		
	}

}
