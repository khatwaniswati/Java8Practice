package com.interviewquestions;

public class JPChase1 {

	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println(parent.i);
		parent.show();
		
		Child child = (Child)new Parent();
		System.out.println(child.i);
		child.show();

	}

	
}

class Parent{
	int i=10;
	public void show() {
		System.out.println("Parent: "+i*10);
	}
}
class Child extends Parent{
	int i=20;
	public void show() {
		System.out.println("Child: "+i*10);
	}
}