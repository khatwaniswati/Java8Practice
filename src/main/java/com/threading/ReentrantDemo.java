package com.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantDemo {
	static ReentrantLock reentrantLock = new ReentrantLock();

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.submit(processData);
		executorService.submit(processData);
		executorService.submit(processData);
		executorService.awaitTermination(30, TimeUnit.SECONDS);
		executorService.shutdown();
		System.out.println("Complete");
	}

	static Runnable processData = () -> {
		try {
			reentrantLock.lockInterruptibly();
			System.out.println("Lock acquired by :" + Thread.currentThread().getName());
			sleep(5000);
			System.out.println(reentrantLock.getHoldCount());
			System.out.println(reentrantLock.isHeldByCurrentThread());
			System.out.println("Releasing lock acquired by :" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			reentrantLock.unlock();
		}
	};

	private static void sleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
