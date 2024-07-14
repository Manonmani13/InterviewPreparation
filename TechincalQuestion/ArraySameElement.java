package com.practices.javapractices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySameElement {
    public static void main(String[] args) {
        Integer a1[]={1,2,3,4,5};
        Integer a2[]={1,2,3};
        Integer a3[]={1,2,3,4};
        System.out.println(sameElement(a1,a2));
        System.out.println(sameElement(a2,a3));

    }
    static boolean sameElement(Object[] array1,Object[] array2)
    {
        Set<Object> unEle=new HashSet<>(Arrays.asList(array1));
        Set<Object> unEle2=new HashSet<>(Arrays.asList(array2));
        if(unEle.size()!=unEle2.size()) return false;
        for(Object obj:unEle)
        {
            if(!unEle2.contains(obj)) return false;
        }
        return true;

    }

}
