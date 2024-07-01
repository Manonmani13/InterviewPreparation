package com.practices.javapractices;

public class LengthOFLastString {
    public static void main(String[] args) {
        String st="Hello Naveen chandar";
        String a[]=st.split(" ");
        String v=a[a.length-1];
        System.out.println(v.length());
    }
}
