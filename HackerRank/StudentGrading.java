package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentGrading {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(73,67,38,33);
        List<Integer> roundedGrades = new ArrayList<>();
        for(int ls:l)
        {
        	if(ls<38)
        		roundedGrades.add(ls);
        	else
        	{
        		int multiple=((ls/5)+1)*5;
        		if(multiple-ls<3)
        			roundedGrades.add(multiple);
        		else
        			roundedGrades.add(ls);
        	}
        		
        	
        }
        System.out.println(roundedGrades.toString());
	}

}
