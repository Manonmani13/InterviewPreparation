package com.collection.Hash;

import com.collection.ArrayList.Laptop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEample {
    public static void main(String[] args) {
        Laptop del=new Laptop(45000,8,true);
        Laptop lenovo=new Laptop(5500086,7,false);
        Laptop hp=new Laptop(40000,9,true);
        HashMap hm=new HashMap();
        hm.put(del,123);
        hm.put(lenovo,124);
        hm.put(hp   ,125);
        System.out.println(hm);
        Set s=hm.entrySet();
        Iterator i=s.iterator();
        while (i.hasNext())
        {
            Map.Entry me= (Map.Entry) i.next();
            Object k=me.getKey();
            Object o=me.getValue();
            Laptop lap= (Laptop) k;
            if(o.equals(124)){
                System.out.println("price "+ lap.price);

            }

        }


    }
}

