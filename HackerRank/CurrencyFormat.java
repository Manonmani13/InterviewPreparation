package com.hackerrank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double payment=sc.nextDouble();
		BigDecimal amount=BigDecimal.valueOf(payment).setScale(2,RoundingMode.HALF_UP);
		NumberFormat usaFormat=NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat indiaFormat=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		NumberFormat chinaFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat franceFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(usaFormat.format(amount)+" "+indiaFormat.format(amount));
		System.out.println(chinaFormat.format(amount)+" "+franceFormat.format(amount));


	}

}
