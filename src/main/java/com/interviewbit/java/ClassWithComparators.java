package com.interviewbit.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ClassWithComparators {
	public static void main(String[] args) {

		/**** Don't alter the code below *****/
		Scanner in = new Scanner(System.in);
		ArrayList<ComparatorPair> arr = new ArrayList<ComparatorPair>();
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			arr.add(new ComparatorPair(a, b));
			in.nextLine();
		}
		in.close();
		Collections.sort(arr, new ComparatorPair.ScalerSortingOrder());
		for (int i = 0; i < n; i++) {
			System.out.println(arr.get(i).first + " " + arr.get(i).second);
		}
		/*********************************************************************/

	}
	static class ComparatorPair {
		int first;
		int second;
		
		public ComparatorPair(int a,int b) {
			first=a;
			second=b;
		}
		
		static class ScalerSortingOrder implements Comparator<ComparatorPair>{
			
			@Override
			public int compare(ComparatorPair o1, ComparatorPair o2) {
				int secondOrder = o2.second-o1.second;
				int firstOrder = o2.first-o1.first;
				return secondOrder==0?firstOrder:secondOrder;
			}
			
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