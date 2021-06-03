package com.interviewbit.java;

import java.util.Scanner;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] arr = new int[R][C];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[] columnSum = columnSum(arr);
		printArray(columnSum);
		sc.close();
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int[] columnSum(int[][] arr) {
		int[] colSum = new int[arr[0].length];
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				colSum[i] += arr[j][i];
			}
		}
		return colSum;
	}
}

/**
Input
3 4
3 2 1 3
1 2 3 4
4 3 1 2
 * 
 */