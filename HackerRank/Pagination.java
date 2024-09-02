package com.hackerrank;

public class Pagination {
	public static void main(String[] args) {
		int p=3,n=5;
		int frontPage=p/2;
        int fromBack=(n/2)-(p/2);
   System.out.println(Math.min(frontPage, fromBack));
	}

}
