package com.solidprinciples;

//Open for extension, Closed for Modification --not followed
public class Operation {

	public double calculate(double a, double b, String operationType) {
		switch (operationType) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		default:
		}
		return 0;
	}
}
