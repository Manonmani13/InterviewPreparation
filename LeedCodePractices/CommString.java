package com.practices.leedconde;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class CommString {
    public static void main(String[] args) {
        String[] strArray = {"flower", "flow", "flight"};
        StringBuffer sb = new StringBuffer();

        // Step 1: Generate all prefixes and store them in StringBuilder
        for (String str : strArray) {
            for (int i = 1; i <= str.length(); i++) {
                sb.append(str.substring(0, i)).append(",");
            }
        }
        System.out.println(sb);

        // Step 2: Convert StringBuilder to String and split by ","
        String[] prefixes = sb.toString().split(",");

        // Step 3: Check for duplicates using a Set
        Set<String> duplicates = new HashSet<>();
        Set<String> wordSet = new HashSet<>();

        for (String prefix : prefixes) {
            if (!wordSet.add(prefix)) {
                duplicates.add(prefix);
            }
        }

        // Step 4: Print out duplicates found
        System.out.println("Duplicate prefixes:");
        for (String dup : duplicates) {
            System.out.println(dup);
        }
    }
}
