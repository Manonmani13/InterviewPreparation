package com.practices.leedconde;

public class FloderCheck {
    public static int minOperations(String[] logs) {
        int depth=0;
        for(String custom:logs)
        {
            if(custom.equals("./"))
            {

            }
            else if(custom.equals("../"))
            {
                if (depth > 0) {
                    depth--;
                } else {

                }
            }
            else
            {
                depth++;
            }

        }
        return Math.max(0,depth);
    }

    public static void main(String[] args) {
        String[] logs = {"./","wz4/","../","mj2/","../","../","ik0/","il7/"};

        System.out.println(minOperations(logs));
    }
}
