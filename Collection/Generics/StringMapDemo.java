package com.collection.Generics;

import java.util.HashMap;

public class StringMapDemo {
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
    }
}
