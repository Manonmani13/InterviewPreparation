package com.hackerrank;

public class PlusMinus {
	public static void main(String[] args) {
		int n[]= {-4,3,-9,0,4,1};
		int countnegative=0,countpositve=0,zeroCount=0;
		for(int no:n)
		{
			if(no<0)
			{
				countnegative++;
			}
			else if(no>0)
			{
				countpositve++;
			}
			else if(no==0)
			{
				zeroCount++;
			}
		}
		double positiveRatio = (double) (countpositve) / n.length;
        double negativeRatio = (double) countnegative / n.length;
        double zeroRatio = (double) zeroCount / n.length;

        System.out.printf("%.6f%n", positiveRatio);
        System.out.printf("%.6f%n", negativeRatio);
        System.out.printf("%.6f%n", zeroRatio);
	}

}
