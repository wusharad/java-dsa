package com.demo.dsa.linkedList.PartitionList;

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

	public void printNode(Node node, String nodeName) {
		String printNode = "[";
		while(node !=null) {
			printNode = printNode + node.value+", ";
			node = node.next;
		}
		System.out.print(nodeName+"="+printNode+"]");
		System.out.print("\n");
	}
	
	public void partitionList_OG(int x) {
		if (head == null)
			return;

		Node dummy1 = new Node(0);
		Node dummy2 = new Node(0);
		Node prev1 = dummy1;
		Node prev2 = dummy2;
		Node current = head;
		System.out.println("Before while loop");
		System.out.println("");
		printNode(current, "current");
		printNode(dummy1, "dummy1");
		printNode(dummy2, "dummy2");
		printNode(prev1, "prev1");
		printNode(prev2, "prev2");
		System.out.println("----------------------------------------------------------");
		int index = 0;
		while (current != null) {
			if (current.value < x) {
				prev1.next = current;
				System.out.println("while("+index+") prev1.next = current; ");
				printNode(prev1, "prev1");
				printNode(current, "current");
				printNode(dummy1, "dummy1");
				printNode(dummy2, "dummy2");
				printNode(prev2, "prev2");
				System.out.println("----------------------------------------------------------");
				prev1 = current;
				System.out.println("while("+index+") prev1 = current; ");
				printNode(prev1, "prev1");
				printNode(current, "current");
				printNode(dummy1, "dummy1");
				printNode(dummy2, "dummy2");
				printNode(prev2, "prev2");
				System.out.println("----------------------------------------------------------");
				
			} else {
				prev2.next = current;
				System.out.println("while("+index+") prev1 = current; ");
				printNode(prev2, "prev2");
				printNode(current, "current");
				printNode(dummy1, "dummy1");
				printNode(dummy2, "dummy2");
				printNode(prev1, "prev1");
				System.out.println("----------------------------------------------------------");
				prev2 = current;
				System.out.println("while("+index+") prev2 = current; ");
				printNode(prev2, "prev2");
				printNode(current, "current");
				printNode(dummy1, "dummy1");
				printNode(dummy2, "dummy2");
				printNode(prev1, "prev1");
				System.out.println("----------------------------------------------------------");
			}
			current = current.next;
			System.out.println("while("+index+") current = current.next; ");
			printNode(current, "current");
			printNode(prev2, "prev2");
			printNode(dummy1, "dummy1");
			printNode(dummy2, "dummy2");
			printNode(prev1, "prev1");
			System.out.println("----------------------------------------------------------");
			index ++;
		}

		prev2.next = null;
		System.out.println("Ouside while loop: prev2.next = null; ");
		printNode(prev2, "prev2");
		printNode(current, "current");
		printNode(dummy1, "dummy1");
		printNode(dummy2, "dummy2");
		printNode(prev1, "prev1");
		System.out.println("----------------------------------------------------------");
		
		prev1.next = dummy2.next;
		System.out.println("Ouside while loop: prev1.next = dummy2.next; ");
		printNode(prev1, "prev1");
		printNode(prev2, "prev2");
		printNode(current, "current");
		printNode(dummy1, "dummy1");
		printNode(dummy2, "dummy2");
		System.out.println("----------------------------------------------------------");

		head = dummy1.next;
		System.out.println("Ouside while loop: head = dummy1.next; ");
		printNode(head, "head");
		printNode(prev1, "prev1");
		printNode(prev2, "prev2");
		printNode(current, "current");
		printNode(dummy1, "dummy1");
		printNode(dummy2, "dummy2");
		System.out.println("----------------------------------------------------------");
	}

	public void partitionList(int x) {
		if (head == null)
			return;

		Node dummy1 = new Node(0);
		Node dummy2 = new Node(0);
		Node prev1 = dummy1;
		Node prev2 = dummy2;
		Node current = head;
		while (current != null) {
			if (current.value < x) {
				prev1.next = current;
				prev1 = current;
				
			} else {
				prev2.next = current;
				prev2 = current;
			}
			current = current.next;
		}

		prev2.next = null;
		prev1.next = dummy2.next;
		head = dummy1.next;
	}
	
	
	
	public void partitionList_shar(int i) {
		Node before = new Node(0);
		Node after = new Node(0);
		Node tailBefore = before;
		Node tailAfter = after;
		Node list = head;
		
		while(list != null) {
			if(list.value < i) {
				tailBefore.next = list;
				tailBefore = tailBefore.next;
			}else {
				tailAfter.next = list;
				tailAfter = tailAfter.next;
			}
			list = list.next;
		}
		tailAfter.next = null;
		tailBefore.next = after.next;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
