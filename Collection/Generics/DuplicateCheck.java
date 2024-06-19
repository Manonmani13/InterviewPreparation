package com.collection.Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCheck {
    public static void main(String[] args) {
        String nam="ManoNaveen";
        HashMap<Character,Integer> hm=new HashMap<>();
        System.out.println(hm);
        char[] ch=nam.toCharArray();
        for(char c:ch)
        {
            if(hm.containsKey(c))
            {
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);

            }
        }
        System.out.println(hm);
        Set<Map.Entry<Character,Integer>> se=hm.entrySet();
        for(Map.Entry<Character,Integer> entry:se)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        Set<Map.Entry<Character,Integer>> s=hm.entrySet();
        for(Map.Entry<Character,Integer> entry:s) {
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
