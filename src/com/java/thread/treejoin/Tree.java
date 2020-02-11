package com.java.thread.treejoin;

public class Tree {

	int val;
	Tree left;
	Tree right;

	Tree(int node) {
		this.val = node;
		this.left = null;
		this.right = null;
	}

	public void insert(int val) {
		if (this.val == val) {
			System.out.println("Val: " + val + " already present");
		} else if (this.val > val) {
			if (this.left == null) {
				this.left = new Tree(val);
			} else {
				this.left.insert(val);
			}
		} else {
			if (right == null) {
				this.right = new Tree(val);
			} else {
				this.right.insert(val);
			}
		}
	}

	public int sumValues() {
		// TODO Auto-generated method stub
		int leftSum = 0;
		int rightSum = 0;
		if ( this.left == null && this.right == null )
		{
			return this.val;
		}
		if (this.left !=null)
		{
			leftSum = this.left.sumValues();
		}
		 if (this.right !=null)
		 {
			 rightSum = this.right.sumValues();
		 }
		return this.val + leftSum + rightSum;
	}
}
