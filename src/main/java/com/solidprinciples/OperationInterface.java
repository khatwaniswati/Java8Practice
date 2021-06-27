package com.solidprinciples;

//Open for Extension, Closed for modification -- followed
public interface OperationInterface {

	public double calculate(double a, double b);

}

class AddOperation implements OperationInterface {

	@Override
	public double calculate(double a, double b) {
		return a + b;
	}

}

//can add any number of operations 
class DivisionOperation implements OperationInterface {

	@Override
	public double calculate(double a, double b) {
		return a / b;
	}

}
