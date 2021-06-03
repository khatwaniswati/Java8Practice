package com.interviewbit.java;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DQueueApplication {
	private static Deque<Integer> queue = new LinkedList<>();

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
			else if(arr[i][0] == 2)
				queue.addFirst(arr[i][1]);
			else if (arr[i][0] == 3) {
				if (queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.getFirst());
			}else if (arr[i][0] == 4) {
				if (queue.isEmpty())
					System.out.println(-1);
				else
					System.out.println(queue.getLast());
			} else if (arr[i][0] == 5) {
				if (!queue.isEmpty())
					queue.pollFirst();
			}else if (arr[i][0] == 6) {
				if (!queue.isEmpty())
					queue.pollLast();
			}
		}
	}

}
/**
7
2 1
1 5
3 -1
4 -1
5 -1
6 -1
3 -1

1
5
-1
*/