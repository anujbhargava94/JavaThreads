package com.java.thread.deadlock;

public class Deadlock {
	public static void main(String[] args) {

		Resource r1 = new Resource();
		Resource r2 = new Resource();

		One t1 = new One(r1, r2); // thread
		Two t2 = new Two(r1, r2); // thread

		t1.start();
		t2.start();
	}
}
