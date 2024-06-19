package com.collection.Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMApIteratorExample {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put("Nellai Exp",1900);
        hm.put("Mannai Exp",2000);
        hm.put("Mumbai Exp",2100);
        hm.put("Vangi Exp",2100);
        Set s=hm.entrySet();
        System.out.println(s);
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            Object o=i.next();
            Map.Entry e= (Map.Entry) o;
            Object v= e.getValue();
            Object k=e.getKey();
            if(v.equals(2100))
            System.out.println(e.getKey()+" : "+e.getValue());
        }


    }
}

