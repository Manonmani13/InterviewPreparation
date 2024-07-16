package com.practices.leedconde;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterSections {
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1}, nums2 []= {2,2};
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums1)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
       List<Integer> inter=new ArrayList<>();
        for(int num:nums2)
        {
            if(map.containsKey(num)&& map.get(num)>0)
            {
                inter.add(num);
                map.put(num,map.get(num)-1);
            }
        }

            System.out.println(inter);



}
}
