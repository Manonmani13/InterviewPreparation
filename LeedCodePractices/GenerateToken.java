package com.practices.leedconde;

import java.util.ArrayList;
import java.util.List;

public class GenerateToken {
    public static List<String>  generateParentheses(int n)
    {
        List<String > ls=new ArrayList<>();
        generate(ls,"",0,0,n);
        return ls;
    }
    public  static void generate(List<String> ls,String c,int open,int end,int max)
    {
        if(c.length()==2*max)
        {
            ls.add(c);
            return;
        }
        if(open<max)
        {
            generate(ls,c+"(",open+1,end,max);
        }
        if(end<open)
            generate(ls,c+")",open,end+1,max);

    }
    public static void main(String[] args) {
        int n1 = 3;
        System.out.println("Combinations for n = " + n1 + ": " + generateParentheses(n1));

        int n2 = 1;
        System.out.println("Combinations for n = " + n2 + ": " + generateParentheses(n2));
    }

}
