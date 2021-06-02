package com.interviewbit.java;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int[] reversedArray = reverseArray(arr);
		printArray(reversedArray);
	}

	private static int[] reverseArray(int[] arr) {
		int[] result = new int[arr.length];
		for (int i = arr.length - 1, j = 0; i >= 0 && j < arr.length; i--, j++) {
			result[j] = arr[i];
		}
		return result;
	}
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

/**
 * Input
5
2
1
11
13
14

Output 
14
13
11
1
0

*/
