package com.interviewbit.java;

import java.util.Scanner;

public class StringOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();
		System.out.println(A.length() + B.length());
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println(A.toUpperCase() + " " + B.toUpperCase());
	}
}
/**
abc
def
*/