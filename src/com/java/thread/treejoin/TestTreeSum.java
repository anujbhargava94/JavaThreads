package com.java.thread.treejoin;

public class TestTreeSum {

	
		public static void main(String[] args) {
		Tree tr;
		tr = new Tree(1000);
		tr.insert(5);
		tr.insert(56);
		tr.insert(2000);
		tr.insert(1500);
		TreeSum thread1 = new TreeSum(tr.left);
		TreeSum thread2 = new TreeSum(tr.right);

		thread1.start();
		thread2.start();

		System.out.println(tr.val +
				thread1.sum + thread2.sum);
		
		
//		try {
//		     thread1.join();
//		     thread2.join();
//		} 
//		catch (InterruptedException e) {}
//
//		 System.out.println(tr.val +
//			thread1.sum + thread2.sum);
//		 }
		}
}
