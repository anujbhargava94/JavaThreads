package com.java.thread.producerconsumer;

import java.util.Random;

public class Producer extends Thread {

	private DropBox db;

	public Producer(DropBox db) {
		this.db = db;
	}

	public void run() {
		
			for (int i = 0; i < 5; i++) {
				db.put(i);
				System.out.println("Put"+i);
				try {
					Thread.sleep(new Random().nextInt(500));
				} catch (InterruptedException e) {
				}
			
		}
	}
}
