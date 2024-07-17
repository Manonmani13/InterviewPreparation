package com.practices.leedconde;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfNumbers {



    public static void main(String[] args) {
        String digit="23";
        System.out.println(letterCombinations(digit));
    }
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] mapping = {
                "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        generateCombinations(digits, mapping, 0, new StringBuilder(), result);
        return result;
    }

    private static void generateCombinations(String digits, String[] mapping, int index, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            generateCombinations(digits, mapping, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
