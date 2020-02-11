package com.java.thread.deadlock;

public class Resource {
	int id = 0; // 0 => resource not in use

	synchronized public void acquire(int id) {
		while (this.id != 0) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.id = id; // Thread ‘id’ gets resource
	}

	synchronized public void release() {
		id = 0; // Thread releases the resource
		notify();
	}
}
