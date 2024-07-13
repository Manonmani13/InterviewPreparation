package com.practices.techinicalQuestion;

import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static void main(String[] args) {
        String name="Manonmani pandukumar";
        System.out.println(name +" "+countCharacter(name));
    }
    public static Map<Character, Integer> countCharacter(String str)
    {
        Map<Character, Integer> co= new HashMap<>();
        for(char c:str.toCharArray())
        {
            co.put(c,co.getOrDefault(c,0)+1);
        }
        return co;
    }

}
