package com.java.thread.deadlock;

public class Two extends Thread {
	Resource r1, r2;

	public Two(Resource r1, Resource r2) {
		this.r1 = r1;
		this.r2 = r2;
	}

	public void run() {
		try {
			while (true) {
				r2.acquire(2);
				r1.acquire(2);
				r2.release();
				r1.release();
			}
		} catch (Exception e) {
		}
	}
}
