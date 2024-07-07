package com.practices.leedconde;

public class EchangeBottle {
    public static int numWaterBottle(int numBottle,int numExchange)
    {
        int totalNumber=numBottle;
        int drink=0,emptyBottle=0;
        while(totalNumber>0)
        {
            drink++;
            emptyBottle++;
            totalNumber--;
            if(emptyBottle>=numExchange)
            {
                int no=emptyBottle/numExchange;
                totalNumber+=no;
                emptyBottle=emptyBottle%numExchange;
            }
        }
        return drink;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottle(15,4));
    }
}
