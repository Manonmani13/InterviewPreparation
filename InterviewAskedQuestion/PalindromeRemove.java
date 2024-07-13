package com.practices.question;

public class PalindromeRemove {
    public static void main(String[] args) {
        String val="This is racecar";
        String s[]=val.split(" ");
        String withoutPalindorme="";


        for(String va:s)
        {
            String remove="";

            for(int i =va.length()-1;i>=0;i--)
            {
                remove+=va.charAt(i);
            }
            System.out.println(remove);
            if(!va.equalsIgnoreCase(remove))
            {
                withoutPalindorme+=va+" ";
            }
        }
        System.out.println(withoutPalindorme);
    }
}
