package com.interviewbit.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LambdaExpressionDemo {
	public static void main(String[] args) {

		/**** Don't alter the code below *****/
		Scanner in = new Scanner(System.in);
		ArrayList<pair> arr = new ArrayList<pair>();
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			arr.add(new pair(a, b));
			in.nextLine();
		}
		in.close();
		Comparator<pair> scalerSortingOrder = (o1,o2) -> (o2.second-o1.second)==0?o2.first-o1.first:o2.second-o1.second;
		Collections.sort(arr, scalerSortingOrder);
		for (int i = 0; i < n; i++) {
			System.out.println(arr.get(i).first + " " + arr.get(i).second);
		}
		/*********************************************************************/

	}
	static class pair {
		int first;
		int second;
		
		public pair(int a,int b) {
			first=a;
			second=b;
		}
	}
}
/**
Input
3
1 2
3 2
3 3
output
3 3
3 2
1 2
*/