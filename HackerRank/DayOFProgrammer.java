package com.hackerrank;

public class DayOFProgrammer {
private static boolean isJulianLeapYear(int year)
{
	return year%4==0;
}
private static boolean isGregorianLeapYear(int year)
{
	return (year%4==0&& year%100!=0)||(year%400==0);
}
private static String getDayOfProgrammer(int year)
{
	int dayof[];
	if(year<1918)
	{
		dayof = new int[]{31, 29, 31, 30, 31, 30, 31, 31};
	}
	else if(year==1918)
	{
		dayof=new int[] {31,15,31,30,31,30,31,31};
	}
	else
	{
		if(isGregorianLeapYear(year))
		{
			dayof=new int[]{31, 29, 31, 30, 31, 30, 31, 31};
		}
		else
		{
			dayof=new int[]{31, 28, 31, 30, 31, 30, 31, 31};

		}
	}
	int toalDay=0;
	for(int day:dayof)
	{
		toalDay+=day;
	}
	int dayIn=256-toalDay;
	return String.format("%02d.09.%d", dayIn,year);
}
public static void main(String[] args) {
	int year1 = 2016;
    int year2 = 1800;

    System.out.println(getDayOfProgrammer(year1)); // Output: 12.09.2016
    System.out.println(getDayOfProgrammer(year2));
}
}
