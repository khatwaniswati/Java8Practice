package com.threading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.threading.executorservice.SimpleExecutor1.Task;

public class CPUIntensive {
	public static void main(String[] args) {
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		ExecutorService service = Executors.newFixedThreadPool(availableProcessors);
		for (int i = 0; i < 100; i++) {
			service.execute(new Task());
		}
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}

	static class CPUIntensiveTask implements Runnable {

		@Override
		public void run() {
			sleep(3000);
			System.out.println("Thread Name: " + Thread.currentThread().getName());
			//CPU Intensive Tasks
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
