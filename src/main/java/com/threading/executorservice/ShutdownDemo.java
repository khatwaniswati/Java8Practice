package com.threading.executorservice;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ShutdownDemo {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 20; i++) {
			service.execute(new Task());
		}

		// initiate shutdown
		service.shutdown();

		// will throw RejectionExecutionException
		// service.execute(new Task());

		// will return true bcoz shutdown has begun
		System.out.println(service.isShutdown());

		// will return true if all tasks are completed including queued ones
		System.out.println(service.isTerminated());

		// blocks untill all tasks are completed or if timeout occurs
		System.out.println(service.awaitTermination(10, TimeUnit.SECONDS));

		// will initiate shutdown and return all queued tasks
		List<Runnable> queuedTasks = service.shutdownNow();
		System.out.println(queuedTasks.size());
	}

	static class Task implements Runnable {

		@Override
		public void run() {
			sleep(10000);
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
}
