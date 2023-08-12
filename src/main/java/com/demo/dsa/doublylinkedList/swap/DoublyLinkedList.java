package com.demo.dsa.doublylinkedList.swap;

public class DoublyLinkedList {
	/**
	 * Implement a method called swapPairs within the class that swaps the values of
	 * adjacent nodes in the linked list. The method should not take any input
	 * parameters.
	 * 
	 * Note: This DoublyLinkedList does not have a tail pointer which will make the
	 * implementation easier.
	 * 
	 * Example:1-->2-->3-->4--> should become 2-->1-->4-->3-->
	 */

	private Node head;
	private Node tail;
	private int length;

	class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}
	}

	public DoublyLinkedList(int value) {
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
		System.out.println("\nDoubly Linked List:");
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
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
		}
		length++;
	}

	public void printNode(Node node, String nodeName) {
		String printNode = "[";
		while (node != null) {
			printNode = printNode + node.value + ", ";
			node = node.next;
		}
		System.out.print(nodeName + "=" + printNode + "]");
		System.out.print("\n");
	}

	public void swapPairs_ref() {
		Node pre = head;
		if (length > 1) {
			while (pre != null) {
				System.out.println("while(pre.next!=null )");
				printNode(pre, "pre");
				System.out.println("----------------------------------------------------------");

				Node aft = pre.next;
				System.out.println("Node aft = pre.next;");
				printNode(aft, "aft");
				printNode(pre, "pre");
				System.out.println("----------------------------------------------------------");

				pre.next = aft.next;
				System.out.println("pre.next = aft.next;");
				printNode(pre, "pre");
				printNode(aft, "aft");
				System.out.println("----------------------------------------------------------");

				if (aft.next != null)
					aft.next.prev = pre;
				System.out.println("if(aft.next != null)aft.next.prev = pre;");
				printNode(aft, "aft");
				printNode(pre, "pre");
				System.out.println("----------------------------------------------------------");

				aft.next = pre;
				System.out.println("aft.next = pre;");
				printNode(aft, "aft");
				printNode(pre, "pre");
				System.out.println("----------------------------------------------------------");

				aft.prev = pre.prev;
				System.out.println("aft.prev = pre.prev;");
				printNode(aft, "aft");
				printNode(pre, "pre");
				System.out.println("----------------------------------------------------------");

				if (pre.prev != null)
					pre.prev.next = aft;

				pre.prev = aft;
				System.out.println("pre.prev = aft;");
				printNode(pre, "pre");
				printNode(aft, "aft");
				System.out.println("----------------------------------------------------------");

				pre = pre.next;
				System.out.println("pre = pre.next;");
				printNode(pre, "pre");
				printNode(aft, "aft");
				System.out.println("----------------------------------------------------------");
			}
			head = head.prev;
			tail = tail.next;
			System.out.println("tail = tail.next;");
			printNode(head, "head");
			printNode(tail, "tail");
			System.out.println("----------------------------------------------------------");
		}
	}
	//refer my below version, my version is better than udemy
	/**
	 * my version
	 */
	public void swapPairs() {
		Node pre = head;
		if (length > 1) {
			while (pre != null) {
				Node aft = pre.next;
				pre.next = aft.next;
				if (aft.next != null)
					aft.next.prev = pre;
				aft.next = pre;
				aft.prev = pre.prev;
				if (pre.prev != null)
					pre.prev.next = aft;
				pre.prev = aft;
				pre = pre.next;
			}
			head = head.prev;
			tail = tail.next;
		}
	}

	/**
	 * Udemy
	 */
	public void swapPairs_udemy() {
		Node dummy = new Node(0);
		dummy.next = head;
		Node prev = dummy;

		while (head != null && head.next != null) {
			Node firstNode = head;
			Node secondNode = head.next;

			prev.next = secondNode;
			firstNode.next = secondNode.next;
			secondNode.next = firstNode;

			secondNode.prev = prev;
			firstNode.prev = secondNode;
			if (firstNode.next != null) {
				firstNode.next.prev = firstNode;
			}
			head = firstNode.next;
			prev = firstNode;
		}

		head = dummy.next;
		if (head != null)
			head.prev = null;
	}

}
