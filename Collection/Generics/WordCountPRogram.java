package com.collection.Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCountPRogram {
    public static void main(String[] args) {
        countChar();
    }
    static void countChar()
    {
        HashMap<String,Integer> hm=new HashMap<>();
        System.out.println(hm);
        String nam="Mannmani Naveen Pandukumar Deepthi Naveen  Selvam Krishna Naveen";
        String names[]=nam.split(" ");
        for(String c:names)
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
        Set<Map.Entry<String,Integer>> se=hm.entrySet();
        for(Map.Entry<String,Integer> entry:se)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

}
