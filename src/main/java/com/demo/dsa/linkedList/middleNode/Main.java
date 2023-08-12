package com.demo.dsa.linkedList.middleNode;

public class Main {

	public static void main(String[] args) {

		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);
		myLinkedList.append(6);

		System.out.println("Middle Node:");
		System.out.println(myLinkedList.findMiddleNode().value);

		/*
		 * EXPECTED OUTPUT: ---------------- Middle Node: 3
		 * 
		 */

	}

}
