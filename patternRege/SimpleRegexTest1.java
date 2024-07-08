package com.practices.patternRege;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegexTest1 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("manonmani",Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher("Manonmani Pandukumar");
        if(m.find())
        {
            System.out.println("match found");
        }
    }
}
