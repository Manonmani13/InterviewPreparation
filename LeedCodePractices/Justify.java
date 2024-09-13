package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Justify {
	public static void main(String[] args) {
		String[] words1 = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth1 = 16;
        System.out.println(fullJustify(words1, maxWidth1));

	}
	public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList();
        List<String> currentLine = new ArrayList<>();
        int numOfLetters = 0;

        for (String word : words) {
            if (numOfLetters + word.length() + currentLine.size() > maxWidth) {
                result.add(justifyLine(currentLine, numOfLetters, maxWidth, false));
                currentLine = new ArrayList<>();
                numOfLetters = 0;
            }
            currentLine.add(word);
            numOfLetters += word.length();
        }
        
        // Last line is left-justified
        result.add(justifyLine(currentLine, numOfLetters, maxWidth, true));
        
        return result;
    }
	 private static String justifyLine(List<String> words, int numOfLetters, int maxWidth, boolean isLastLine) {
	        if (words.size() == 1 || isLastLine) {
	            return leftJustify(words, maxWidth);
	        }

	        int totalSpaces = maxWidth - numOfLetters;
	        int spaceBetweenWords = totalSpaces / (words.size() - 1);
	        int extraSpaces = totalSpaces % (words.size() - 1);

	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < words.size(); i++) {
	            sb.append(words.get(i));
	            if (i < words.size() - 1) {
	                int spacesToAdd = spaceBetweenWords + (i < extraSpaces ? 1 : 0);
	                for (int j = 0; j < spacesToAdd; j++) {
	                    sb.append(' ');
	                }
	            }
	        }
	        return sb.toString();
	    }
	 private static String leftJustify(List<String> words, int maxWidth) {
	        StringBuilder sb = new StringBuilder();
	        for (String word : words) {
	            sb.append(word).append(' ');
	        }
	        String result = sb.toString();
	        result = result.substring(0, result.length() - 1); // Remove the last extra space
	        while (result.length() < maxWidth) {
	            result += ' ';
	        }
	        return result;
	    }
}
