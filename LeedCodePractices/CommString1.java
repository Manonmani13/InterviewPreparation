package com.practices.leedconde;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class CommString {
    public static void main(String[] args) {
        // Example usage of longestCommonPrefix in Java 8 context
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println("Longest common prefix for strs1: " + longestCommonPrefix(strs1)); // Output: "fl"
        System.out.println("Longest common prefix for strs2: " + longestCommonPrefix(strs2)); // Output: ""
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Optional<String> commonPrefix = Arrays.stream(strs)
                .reduce((s1, s2) -> {
                    int length = Math.min(s1.length(), s2.length());
                    int i = 0;
                    while (i < length && s1.charAt(i) == s2.charAt(i)) {
                        i++;
                    }
                    return s1.substring(0, i);
                });

        return commonPrefix.orElse("");
    }
}
