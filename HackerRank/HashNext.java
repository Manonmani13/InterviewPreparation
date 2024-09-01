package com.hackerrank;

import java.util.Scanner;

public class HashNext {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int lineNo=1;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            String line=sc.nextLine();
            System.out.println(lineNo+" "+line);
            lineNo++;
        }
        sc.close();
    }

}
