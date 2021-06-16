package com.threading.executorservice;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RejectedExecutionExceptionHandlerDemo {

	public static void main(String[] args) {
		ExecutorService service = new ThreadPoolExecutor(2, 5, 120, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5),
				new CustomRejectionHandler());
		try {
			for (int i = 0; i < 100; i++) {
				service.execute(new Task());
			}
		} catch (RejectedExecutionException e) {
			System.err.println("task Rejected::" + e.getMessage());
		}

	}

	static class Task implements Runnable {

		@Override
		public void run() {
			sleep(3000);
			System.out.println("Thread Name: " + Thread.currentThread().getName());
			// short lived task
		}

		private void sleep(long millis) {
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	private static class CustomRejectionHandler implements RejectedExecutionHandler {

		@Override
		public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
			System.out.println("Custom Rejection.........");
		}

	}

}