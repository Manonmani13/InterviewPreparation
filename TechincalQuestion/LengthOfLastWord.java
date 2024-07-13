package com.practices.techinicalQuestion;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String names="Naveen chandar";
        String name[]=names.split(" ");
        System.out.println(name[name.length-1].length());
    }
}
