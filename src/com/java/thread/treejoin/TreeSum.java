package com.java.thread.treejoin;

public class TreeSum extends Thread {
	Tree tr;
	int sum;

	public TreeSum(Tree tr) {
		this.tr = tr;
	}

	public void run() {
		if (tr != null) {
			sum = tr.sumValues();
		}
	}
}
