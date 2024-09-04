package com.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PickingNo {
	public static void main(String[] args) {
		int n[]= {1, 2 ,2, 3 ,1 ,2};
        Map<Integer, Integer> fm=new HashMap<Integer, Integer>();
        for(int num:n)
        {
        	fm.put(num, fm.getOrDefault(num,0)+1);
        }
        int max=0;
        for(int num:fm.keySet())
        {
        	int current=fm.get(num);
        	int next=fm.getOrDefault(num+1, 0);
        	max=Math.max(max, current+next);
        }
        System.out.println(max);

	}

}
