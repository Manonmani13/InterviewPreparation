package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	public static void main(String[] args) {
        Map<String, List<String>> anagramMap = new HashMap();
        String str[]= {"eat","tea","tan","ate","nat","bat"};
        for(String st:str)
        {
        	char c[]=st.toCharArray();
        	Arrays.sort(c);
        	String sort=new String(c);
        	if(!anagramMap.containsKey(sort))
        	{
                anagramMap.put(sort,new ArrayList<>());
        	}
            anagramMap.get(sort).add(st);

        }
        System.out.println(anagramMap);

	}

}
