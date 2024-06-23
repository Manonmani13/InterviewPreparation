package com.lamda;
interface  Sayable{
    String say(String mesage);
}
public class LamdaExampleJavaTPoint {
    public static void main(String[] args) {
        Sayable pers=(mesage -> {
            String s1="I would like to say";
            String s2=s1+mesage;
            return s2;
        });
        System.out.println(pers.say("time is precious"));

    }
}
