package com.practices.techinicalQuestion;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        boolean  isAnagram=checkAnagram(str1,str2);
        System.out.println(isAnagram);
    }

    private static boolean checkAnagram(String str1, String str2) {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        char c1[]=str1.toCharArray();
        char c2[]=str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
