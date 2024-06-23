package com.collection.statck;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        st.push("Manonmani");
        st.push("Naveeen");
        st.push("Pandukumar");
        st.push("Maha");
        System.out.println(st);
        st.pop();
        System.out.println(st);

    }
}
