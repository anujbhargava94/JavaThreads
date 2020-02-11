package com.java.thread.producerconsumer;

public class ProducerConsumer {

	public static void main(String[] args) {
		DropBox db = new DropBox();
		Producer p = new Producer(db);
		Consumer c = new Consumer(db);
		p.start();
		c.start();
	}

}
