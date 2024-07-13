package com.practices.question;

public class VersionFinder {
    public static void main(String[] args) {
        String version1="1.2.03";
        String version2="1.2.3";
        if(isGreaterThan(version1,version2))
        {
            System.out.println("Downgraded");
        }
        else if(isLessThan(version1,version2))
        {
            System.out.println("Upgreated");
        }
        else if(isEqualTo(version1,version2))
        {
            System.out.println("Equal");
        }


    }
    public static boolean isGreaterThan(String version1,String version2)
    {
        return compareValues(version1,version2)>0;
    }
    public static boolean isLessThan(String version1,String version2)
    {
        return compareValues(version1,version2)<0;
    }
    public static boolean isEqualTo(String version1,String version2)
    {
        return compareValues(version1,version2)==0;
    }
    public static int compareValues(String version1,String version2)
    {
        String part1[]=version1.split("\\.");
        String part2[]=version2.split("\\.");
        int length=Math.max(part1.length,part2.length);
        for(int i=0;i<length;i++)
        {
            int p1=i<part1.length?Integer.parseInt(part1[i]):0;
            int p2=i<part2.length?Integer.parseInt(part2[i]):0;
            if(p1<p2)
            {
                return-1;
            }
            else if(p1>p2)
            {
                return 1;
            }
        }
        return 0;

    }

}
