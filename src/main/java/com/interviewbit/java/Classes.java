package com.interviewbit.java;

import java.util.Scanner;

public class Classes {
	public static void main(String[] args) {

		/** Don't alter the code below ***************/
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		inp.nextLine();
		int b = inp.nextInt();
		inp.close();

		ClassesPair obj = new ClassesPair();
		System.out.println(obj.first + obj.second);

		System.out.println(a * obj.first);

		System.out.println(b * obj.second);

		/*************************************************/
	}
}

class ClassesPair {
	int first;
	int second;

	public ClassesPair() {
		this.first = 10;
		this.second = 20;
	}
}