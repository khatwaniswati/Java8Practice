package com.threading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.submit(new Task());
	}

	public static class Task implements Runnable {
		CyclicBarrier barrier = new CyclicBarrier(3);

		@Override
		public void run() {
			while (true) {
				try {
					barrier.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
