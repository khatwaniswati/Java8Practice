package com.interviewquestions;

interface A{
	default void show() {
		System.out.println("A");
	}
}
interface B{
	default void show() {
		System.out.println("B");
	}
}
abstract class AB implements A,B{
	public void show() {
		System.out.println("AB");
	}
}
public class JPChase2 extends AB implements A,B{

	public static void main(String[] args) {
		JPChase2 chase2 = new JPChase2();
		chase2.show();
	}
}
