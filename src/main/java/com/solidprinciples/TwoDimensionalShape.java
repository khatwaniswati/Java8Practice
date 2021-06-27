package com.solidprinciples;

//Interface Segregation -- followed
public interface TwoDimensionalShape {
	double calculateArea();
}

interface ThreeDimensionalShape {
	double calculateVolume();
}

class Cuboid1 implements TwoDimensionalShape, ThreeDimensionalShape {

	@Override
	public double calculateArea() {
		return 0;
	}

	@Override
	public double calculateVolume() {
		return 0;
	}

}

class Square1 implements TwoDimensionalShape {

	@Override
	public double calculateArea() {
		return 0;
	}

}