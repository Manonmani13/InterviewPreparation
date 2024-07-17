package com.practices.leedconde;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfNumbers {
    private static final Map<Character,String> map = new HashMap<>();
    static {
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }


    public static void main(String[] args) {
        String digit="23";
        System.out.println(letterCombinations(digit));
    }
    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        backtrack(combinations, digits, 0, new StringBuilder());
        return combinations;
    }

    private static void backtrack(List<String> combinations, String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = map.get(digit);
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(combinations, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
