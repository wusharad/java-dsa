package com.demo.dsa.linkedList;

public class LinkedList {

	private Node head;
	private Node tail;
	private int length;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public int getLength() {
		return length;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printAll() {
		if (length == 0) {
			System.out.println("Head: null");
			System.out.println("Tail: null");
		} else {
			System.out.println("Head: " + head.value);
			System.out.println("Tail: " + tail.value);
		}
		System.out.println("Length:" + length);
		System.out.println("\nLinked List:");
		if (length == 0) {
			System.out.println("empty");
		} else {
			printList();
		}
	}

	public void makeEmpty() {
		head = null;
		tail = null;
		length = 0;
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
			length = 1;
		} else {
			tail.next = newNode;
			tail = newNode;
			length++;
		}
	}

	public Node get(int index) {
		if ((index < 0) || (length <= index)) {
			return null;
		}

		Node temp = head;
		int desiredIndex = 1;
		while (index != desiredIndex) {
			temp = temp.next;
			desiredIndex++;
		}
		return temp;
	}

	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;

		Node revList = null;
		Node proNode = null;
		for (int i = 0; i < length; i++) {
			proNode = temp.next;
			temp.next = revList;
			revList = temp;
			temp = proNode;
		}
	}

}
