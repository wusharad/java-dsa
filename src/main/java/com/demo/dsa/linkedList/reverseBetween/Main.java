package com.demo.dsa.linkedList.reverseBetween;

public class Main {

	public static void main(String[] args) {

		// Create a linked list with values 1, 2, 3, 4, and 5
		LinkedList myLinkedList = new LinkedList(0);
		myLinkedList.append(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);

		System.out.println("Original linked list: ");
		myLinkedList.printList();

		// Reverse a sublist within the linked list
		myLinkedList.reversePartly(1, 3);
		System.out.println("\nReversed sublist (1, 6): ");
		myLinkedList.printList();
	}
}
