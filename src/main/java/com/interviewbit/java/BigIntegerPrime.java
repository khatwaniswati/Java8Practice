package com.interviewbit.java;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		BigInteger b = new BigInteger(s);
		if(b.isProbablePrime(1))
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

}