package com.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ExecutorServiceDemo {

	static ReentrantLock lock = new ReentrantLock();
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);

		executor.submit(new Threading());
		executor.submit(new Threading());
		executor.submit(new Threading());
		
		/*
		 * executor.submit(() -> {
		 * System.out.println(Thread.currentThread().getName()+"Locked: " +
		 * lock.isLocked()); System.out.println("Held by me: " +
		 * lock.isHeldByCurrentThread()); boolean locked = lock.tryLock();
		 * System.out.println("Lock acquired: " + locked); }); executor.submit(() -> {
		 * System.out.println(Thread.currentThread().getName()+"Locked: " +
		 * lock.isLocked()); System.out.println("Held by me: " +
		 * lock.isHeldByCurrentThread()); boolean locked = lock.tryLock();
		 * System.out.println("Lock acquired: " + locked); });
		 */
		stop(executor);
	}

	private static void stop(ExecutorService executor) {
		executor.shutdown();
	}

	private static void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static class Threading implements Callable<Integer>{
		@Override
		public Integer call() throws Exception {
			lock.lock();
			try {
				System.out.println(Thread.currentThread().getName()+"Locked: " + lock.isLocked());
				System.out.println("Held by me: " + lock.isHeldByCurrentThread());
				sleep(1000);
			} finally {
				lock.unlock();
			}
			return null;
		}
	}
}
