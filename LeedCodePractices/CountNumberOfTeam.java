package com.practices.leedconde;

public class CountNumberOfTeam {
    public static void main(String[] args) {
        int[] rating1 = {2, 5, 3, 4, 1};
        System.out.println("Output: " + countValidTeams(rating1)); // Output: 3

        int[] rating2 = {2, 1, 3};
        System.out.println("Output: " + countValidTeams(rating2)); // Output: 0

        int[] rating3 = {1, 2, 3, 4};
        System.out.println("Output: " + countValidTeams(rating3)); // Output: 4

    }

    public static int countValidTeams(int[] ratings)
    {
        int n=ratings.length;
        int count=0;
        for(int j=1;j<n-1;j++)
        {
            int leftSmaller=0;
            int rightGreater=0;
            int leftGreater=0;
            int rightSmaller=0;
            for(int i=0;i<j;i++)
            {
                if(ratings[i]<ratings[j])
                    leftSmaller++;
                else if(ratings[i]>ratings[j])
                    leftGreater++;
            }
            for(int k=j+1;k<n;k++)
            {
                if(ratings[k]>ratings[j])
                    rightGreater++;
                else if(ratings[k]<ratings[j])
                    rightSmaller++;
            }
            count+=leftSmaller*rightGreater;
            count+=leftGreater*rightSmaller;
        }
        return count;

    }

}
