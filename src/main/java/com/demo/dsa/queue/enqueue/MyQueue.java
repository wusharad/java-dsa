package com.demo.dsa.queue.enqueue;

import com.demo.dsa.queue.dequeue.Stack;

public class MyQueue {
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	public MyQueue() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public int peek() {
		return stack1.peek();
	}

	public boolean isEmpty() {
		return stack1.isEmpty();
	}

	public void enqueue(int value) {
		if(stack1 == null )return;
		while(stack1.size() != 0) {
			stack2.push(stack1.pop());
		}
		stack1.push(value);
		while(stack2.size() != 0) {
			stack1.push(stack2.pop());
		}
	}
}
