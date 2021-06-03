package com.interviewbit.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueApplication {
	private static Queue<Integer> queue = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		int[][] arr = new int[Q][2];
		for (int i = 0; i < Q; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		sc.close();
		doStuff(arr);
	}

	private static void doStuff(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] == 1)
				queue.add(arr[i][1]);
			else if (arr[i][0] == 2) {
				if (queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.peek());
			} else if (arr[i][0] == 3) {
				if (!queue.isEmpty())
					queue.poll();
			}
		}
	}

}
/**
5
2 -1
1 5
3 -1
1 5
2 -1
*/