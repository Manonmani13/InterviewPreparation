package com.collection.ArrayList;

import java.util.Comparator;

public class ComparatorCompareToDemo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        int res=s1.compareTo(s2);
        //Ascending
//        if(res>0)
//            return +1;
//        else if(res<0)
//            return -1;
//        else
//            return 0;
        //desc
        if(res>0)
            return -1;
        else if(res<0)
            return +1;
        else
            return 0;
    }
}

