package com.solidprinciples;

//Interface Segregation -- not followed
public interface Shape {
	double calculateArea();

	double calculateVolume();
}

class Cuboid implements Shape {

	@Override
	public double calculateArea() {
		return 0;
	}

	@Override
	public double calculateVolume() {
		return 0;
	}

}

class Square implements Shape {

	@Override
	public double calculateArea() {
		return 0;
	}

	@Override
	public double calculateVolume() {
		return 0;
	}

}