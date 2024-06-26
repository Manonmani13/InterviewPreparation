package com.collection.Hash;

import java.util.HashSet;

public class HashSetRemoveExample {
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("Mano");
        st.add("Manonmani");
        st.add("Naveen");
        st.add("Deepthi");
        st.add("Selvam");
        st.add("Pandukumar");
        st.add("Uma");
        st.add("Maha");
        HashSet<String> st2=new HashSet<>();
        st2.addAll(st);
        st2.add("Kirthu");
        System.out.println(st2);
        System.out.println(st);
        st.removeAll(st2);
        System.out.println(st2);
        st2.removeIf(str->str.contains("Mano"));
        System.out.println(st2);
        st2.clear();
        System.out.println(st2);


    }
}
