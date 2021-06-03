package com.interviewbit.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> sett = new HashSet<>();
		for (int i = 0; i < n; i++) {
			sett.add(sc.nextInt());
		}
		sc.close();
		System.out.println(sett.size());
	}

}
/**

5
1
1
3
1
2

Output
3
*/