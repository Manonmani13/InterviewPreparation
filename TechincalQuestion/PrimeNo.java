package com.practices.javapractices;

public class PrimeNo {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++)
        {
            if(isPrime(i))
                System.out.println(i);


        }
    }

    private static boolean isPrime(int i) {
        int count=0;
        boolean prime=false;
        for(int k=i;k>=1;k--)
        {
            if(i%k==0)
                count++;

        }
        if(count==2)
            prime= true;
        return prime;
    }
}
