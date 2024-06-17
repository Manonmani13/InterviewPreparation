package com.collection.ArrayList;

import java.util.Comparator;

public class ComparatorWithLaptop implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Laptop l=(Laptop) o1;
        Laptop l2=(Laptop)  o2;
        if(((Laptop) o1).price>l2.price)
            return +1;
        if(((Laptop) o1).price<l2.price)
            return -1;
        else
        return 0;
    }
}
