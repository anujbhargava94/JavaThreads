package com.java.thread.deadlock;

public class One extends Thread {
	Resource r1, r2;

	public One(Resource r1, Resource r2) {
		this.r1 = r1;
		this.r2 = r2;
	}

	public void run() { // Thread id
		try {
			while (true) {
				r1.acquire(1);
				r2.acquire(1);
				r1.release();
				r2.release();
			}
		} catch (Exception e) {
		}
	}
}
