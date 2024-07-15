package com.practices.leedconde;

public class Intersection {
    public static void main(String[] args) {
        int num1[]={1,2,2,1},n2[]={2,2};
        String array="";
        for(int i=0;i<num1.length;i++)
        {
            for(int j=0;j<n2.length;j++)
            {
                if(!array.contains(String.valueOf(num1[i])))
                {
                    if(num1[i]==n2[j])
                    {
                        array+=num1[i];
                    }
                }

            }
        }
        System.out.println(array);
    }

}
