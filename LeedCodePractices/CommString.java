package com.practices.leedconde;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class CommString {
    public static void main(String[] args) {
        String[] strArray = {"flower", "flow", "flight"};
        String first=strArray[0];
        for(int i=0;i<=strArray.length-1;i++)
        {
            if(first.contains(strArray[i]))
            {
                System.out.println(strArray[i]);
            }
        }
    }
}
