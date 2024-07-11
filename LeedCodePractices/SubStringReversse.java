package com.practices.leedconde;

public class SubStringReversse {
    public static void main(String[] args) {
        String s1 = "(abcd)";
        String s2 = "(u(love)i)";
        String s3 = "(ed(et(oc))el)";

        System.out.println(reverseParentheses(s1)); // Output: dcba
        System.out.println(reverseParentheses(s2)); // Output: iloveu
        System.out.println(reverseParentheses(s3));

    }
    public static String reverseParentheses(String s) {
        return reverse(s, 0)[0];
    }

    public static  String[] reverse(String s,int start)
    {
        StringBuffer sb=new StringBuffer();
        int i=start;
        while(i<s.length() && s.charAt(i)!=')')
        {
            if(s.charAt(i)=='(')
            {
                String[] res=reverse(s,i+1);
                sb.append(res[0]);
                i=Integer.parseInt(res[1]);
            }
            else {
                sb.append(s.charAt(i));

            }
            i++;
        }
        StringBuilder reversed = new StringBuilder(sb.toString()).reverse();
        StringBuilder result = new StringBuilder();

        for (int j = 0; j < reversed.length(); j++) {
            char ch = reversed.charAt(j);
            if (ch != '(' && ch != ')') {
                result.append(ch);
            }
        }
        return new String[]{result.toString(), String.valueOf(i)};
    }


}
