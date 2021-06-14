package com.threading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecutor1 {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 100; i++) {
			service.execute(new Task());
		}
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}

	static class Task implements Runnable {

		@Override
		public void run() {
			sleep(3000);
			System.out.println("Thread Name: " + Thread.currentThread().getName());
		}

		private void sleep(long millis) {
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
