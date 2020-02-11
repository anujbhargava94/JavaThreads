package com.java.thread.producerconsumer;

public class DropBox {
	private int data;
	private boolean empty = true;

	public synchronized int get() {
		try {
			while (empty)
				wait();
			empty = true;
			notify();
		} catch (InterruptedException e) {
		}
		return data;
	}

	public synchronized void put(int v) {

		try {
			while (!empty)
				wait();
			empty = false;
			data = v;
			notify();
		} catch (InterruptedException e) {
		}
	}

}
