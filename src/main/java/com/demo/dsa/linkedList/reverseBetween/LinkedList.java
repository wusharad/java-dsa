package com.demo.dsa.linkedList.reverseBetween;

public class LinkedList {

	private Node head;
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
		length = 1;
	}

	public Node getHead() {
		return head;
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
		} else {
			System.out.println("Head: " + head.value);
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
		}
		length++;
	}

	public void reverseBetween1(int index1, int index2){
        Node temp = head;
        Node node1;
        Node node2;
        int index =0;
        while(temp != null){
            temp = temp.next;
            index++;
            if(index==index1){
                node1 = temp;
            }else if(index==index2){
                node2 = temp;
            }
            
        }
    }

	public void reverseBetween(int m, int n) {
		if (head == null)
			return;
		// m=1, n=3
		Node dummy = new Node(0);
		System.out.print("Node dummy = new Node(0); ");
		printNode(dummy, "dummy");
		printNode(head, "head");
		System.out.println("----------------------------------------------------------");
		
		dummy.next = head;
		System.out.print("dummy.next = head; ");
		printNode(dummy, "dummy");
		printNode(head, "head");
		System.out.println("----------------------------------------------------------");
		
		Node prev = dummy;
		System.out.print("Node prev = dummy; ");
		printNode(prev, "prev");
		printNode(dummy, "dummy");
		printNode(head, "head");
		System.out.println("----------------------------------------------------------");
		
		for (int i = 0; i < m; i++) {
			prev = prev.next;// head
		}
		System.out.print("After 1st for Loop; ");
		printNode(prev, "prev");
		printNode(dummy, "dummy");
		printNode(head, "head");
		System.out.println("----------------------------------------------------------");
		
		Node current = prev.next;// 1
		System.out.print("Node current = prev.next; ");
		printNode(current, "current");
		printNode(prev, "prev");
		printNode(dummy, "dummy");
		printNode(head, "head");
		System.out.println("----------------------------------------------------------");
		
		for (int i = 0; i < n - m; i++) {
			Node temp = current.next;// 2
			System.out.print("2ndFor["+i+"]; Node temp = current.next; ");
			printNode(temp, "temp");
			printNode(current, "current");
			printNode(prev, "prev");
			printNode(dummy, "dummy");
			printNode(head, "head");
			System.out.println("----------------------------------------------------------");
			
			current.next = temp.next;// 3
			System.out.print("2ndFor["+i+"]; current.next = temp.next; ");
			printNode(current, "current");
			printNode(temp, "temp");
			printNode(prev, "prev");
			printNode(dummy, "dummy");
			printNode(head, "head");
			System.out.println("----------------------------------------------------------");
			
			temp.next = prev.next;
			System.out.print("2ndFor["+i+"]; temp.next = prev.next; ");
			printNode(temp, "temp");
			printNode(current, "current");
			printNode(prev, "prev");
			printNode(dummy, "dummy");
			printNode(head, "head");
			System.out.println("----------------------------------------------------------");
			
			prev.next = temp;
			System.out.print("2ndFor["+i+"]; prev.next = temp; ");
			printNode(prev, "prev");
			printNode(temp, "temp");
			printNode(current, "current");
			printNode(dummy, "dummy");
			printNode(head, "head");
			System.out.println("----------------------------------------------------------");
		}

		head = dummy.next;
		System.out.print("head = dummy.next; ");
		printNode(head, "head");
		printNode(prev, "prev");
		printNode(current, "current");
		printNode(dummy, "dummy");
		System.out.println("----------------------------------------------------------");

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
	
	  public void reverseBetweenOG(int m, int n) {
		if (head == null)
			return;
		Node dummy = new Node(0);
		dummy.next = head;
		Node prev = dummy;

		for (int i = 0; i < m; i++) {
			prev = prev.next;
		}
		Node current = prev.next;
		
		for (int i = 0; i < n - m; i++) {
			Node temp = current.next;
			current.next = temp.next;
			temp.next = prev.next;
			prev.next = temp;
		}
		head = dummy.next;
	}
	  
	  

	  
	  
	  public void reversePartly(int m, int n) {
		  Node finalN = head;
		  int index;
		  for(index=1; index < m; index++ ) {
			  finalN = finalN.next;
		  }
		  Node current = finalN.next;
		  while(index <=n) {
			  Node temp = current.next;
			  current.next = temp.next;
			  temp.next = finalN.next;
			  finalN.next = temp;
			  index++;
		  }
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
