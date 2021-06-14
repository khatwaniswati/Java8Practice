package com.threading.executorservice;

public class SimpleRunnable {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Task());
			t.start();
		}
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}

	static class Task implements Runnable {

		@Override
		public void run() {
			System.out.println("Thread Name: " + Thread.currentThread().getName());
		}

	}

}
