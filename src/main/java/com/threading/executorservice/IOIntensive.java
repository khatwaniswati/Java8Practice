package com.threading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.threading.executorservice.SimpleExecutor1.Task;

public class IOIntensive {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(100);
		// take little more threads bcoz some of the Threads may be in blocked or
		// waiting state due to IO intensive operations
		for (int i = 0; i < 100; i++) {
			service.execute(new Task());
		}
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}

	static class IOIntensiveTask implements Runnable {

		@Override
		public void run() {
			sleep(3000);
			System.out.println("Thread Name: " + Thread.currentThread().getName());
			// IO Intensive Tasks
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
