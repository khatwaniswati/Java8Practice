package com.interviewbit.java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> resultLst = new ArrayList<>();
		while (true) {
			int n = sc.nextInt();
			if (n < 0)
				break;
			resultLst.add(n);
		}
		sc.close();
		printReverseLst(resultLst);
	}

	private static void printReverseLst(List<Integer> resultLst) {
		ListIterator<Integer> li = resultLst.listIterator(resultLst.size());
		while (li.hasPrevious()) {
				System.out.print(li.previous()+" ");
		}
	}
}

/**
Input
11
1
2
6
0
-2
*/