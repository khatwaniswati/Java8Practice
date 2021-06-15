package com.threading.executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

		// task to run after delay of 10 sec
		service.schedule(new Task(), 10, TimeUnit.SECONDS);
		// task to run at fixedRate of 10 sec after 15 sec initial delay
		service.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);
		// task to run at fixedDelay of 10 sec after 15 sec initial delay
		service.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);

		System.out.println("Thread Name: " + Thread.currentThread().getName());
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

}
