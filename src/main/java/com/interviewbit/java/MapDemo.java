package com.interviewbit.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(sc.next(), sc.nextInt());
		}
		int find = sc.nextInt();
		List<String> lst = new ArrayList<>();
		for (int i = 0; i < find; i++) {
			lst.add(sc.next());
		}
		sc.close();
		for (String name : lst) {
			if (map.containsKey(name))
				System.out.println(map.get(name));
			else
				System.out.println("Not Found");
		}
	}

}
/**

3
Ojas
10
Rishabh
5
Akash
15
2
Aka
Ojas
*/