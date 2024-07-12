package com.practices.javapractices;

public class SentanceWithReverseWord {
    public static void main(String[] args) {
        String s="Manonmani Pandukumar";
        String n[]=s.split(" ");
        for(String s1:n)
        {
            for(int i=s1.length()-1;i>=0;i--)
            {
                System.out.print(s1.charAt(i));
            }
        }
    }
}
