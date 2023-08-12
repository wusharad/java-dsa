package com.demo.dsa.linkedList.removeDuplicates;

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
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	/**
	 * Udemy approach
	 */

	public void removeDuplicates() {
		Node current = head;
		while (current != null) {
			Node runner = current;
			while (runner.next != null) {
				if (runner.next.value == current.value) {
					runner.next = runner.next.next;
					length -= 1;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
	
	
	public void removeDupli() {
		Node currentNode = head;
		
		while(currentNode != null) {
			Node temp = currentNode;
			while(temp.next != null) {
				if(temp.next.value==currentNode.value) {
					temp.next = temp.next.next;
					length --;
				}else{
					temp = temp.next;
				}
			}
			currentNode = currentNode.next;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}