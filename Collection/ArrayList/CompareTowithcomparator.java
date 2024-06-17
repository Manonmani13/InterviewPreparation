package com.collection.ArrayList;

import java.util.Comparator;

public class CompareTowithcomparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Laptop l1=(Laptop) o1;
        Laptop l2=(Laptop) o2;
        int result=(l1.moodel).compareTo(l2.moodel);
        if(result>0)
            return +1;
        else if(result<0)
            return -1;
        else
        return 0;
    }
}
