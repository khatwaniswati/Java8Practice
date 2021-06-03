package com.interviewbit.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalDemo {
	static class Data{
		String s;
		BigDecimal val;
		public Data(String s, BigDecimal val) {
			this.s=s;
			this.val=val;
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		Data[] datas = new Data[n];
		for (int i = 0; i < n; i++) {
			Data d = new Data(s[i],new BigDecimal(s[i]));
			datas[i]=d;
		}
		Comparator<Data> com = (d1,d2)->d2.val.compareTo(d1.val) ;

		Arrays.sort(datas,com);

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(datas[i].s);
		}

	}
}

/**
9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

90
 56.6
 50
 02.34
 0.12
 .12
 0
 000.000
 -100
*/