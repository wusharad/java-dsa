package com.demo.dsa.linkedList.removeDuplicates;

public class Main {

	public static void main(String[] args) {

		LinkedList myLinkedList = new LinkedList(1);

		myLinkedList.append(1);
		myLinkedList.append(2);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(3);
		myLinkedList.append(3);
		myLinkedList.append(4);

		myLinkedList.removeDupli();

		myLinkedList.printList();

		/*
		 * EXPECTED OUTPUT: ---------------- 1 2 3 4
		 * 
		 */

	}

}
