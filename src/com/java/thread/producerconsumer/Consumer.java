package com.java.thread.producerconsumer;

import java.util.Random;

public class Consumer extends Thread {
	private DropBox db;

	public Consumer(DropBox db) {
		this.db = db;
	}

	public void run() {
		while (true) {
			int i = db.get();
			System.out.println("Get " + i);
			try {
				Thread.sleep(new Random().nextInt(500));
			} catch (InterruptedException e) {
			}
		}
	}

}
