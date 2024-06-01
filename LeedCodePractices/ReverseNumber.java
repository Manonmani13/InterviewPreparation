package com.leedcode;

public class ReverseNumber {
public static void main(String[] args) {
	 int x=-1,reverse=0,org=x;
     while(x!=0)
     {
         int d=x%10;
         reverse=reverse*10+d;
         x/=10;
     }
     if(org<0)
     {
    	reverse*=-1;
     }
     System.out.println(x);
     if(org==reverse)
     {
         System.out.println("Palindrome");
     }
     else
     System.out.println("Not Palindrome");

}
}
