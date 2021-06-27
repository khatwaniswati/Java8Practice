package com.solidprinciples;

//Dependency Inversion --not followed
/*
 * public class Desktop {
 * 
 * private Monitor monitor; private QwertyKeyboard keyboard;
 * 
 * public Desktop() { this.monitor = new Monitor(); this.keyboard = new
 * QwertyKeyboard(); }
 * 
 * }
 * 
 * class Monitor {}
 * 
 * class QwertyKeyboard {}
 */

//Dependency Inversion -- followed
public class Desktop {

	private Monitor monitor;
	private Keyboard keyboard;

	public Desktop(Monitor monitor, Keyboard keyboard) {
		this.monitor = monitor;
		this.keyboard = keyboard;
	}

}

interface Keyboard {
}

class Monitor {
}

class QwertyKeyboard implements Keyboard {
}