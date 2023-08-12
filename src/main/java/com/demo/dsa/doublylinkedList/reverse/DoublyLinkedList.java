package com.demo.dsa.doublylinkedList.reverse;

public class DoublyLinkedList {

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
    
    public void append (int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
    
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

	public void reverse(){
	    Node current = tail;
	    Node pre = current.prev;
	    current.prev = null;
	    head = current;
	    int index = 0;
	    if(length > 1){
	        while(index < length){
	        	if(pre == null) {
	        		tail = current;
	        		return;
	        	}
	        	pre.next = null;
	        	current.next = pre;
	        	pre = pre.prev;
	        	current.next.prev = current;
	        	current = current.next;
	        	index ++;
	        }
	    }
	}
	/**
	 * Udemy
	 */
	 public void reverse_udemy() {
	        Node current = head;
	        Node temp = null;
	    
	        while (current != null) {
	            temp = current.prev;
	            current.prev = current.next;
	            current.next = temp;
	            current = current.prev;
	        }
	    
	        temp = head;
	        head = tail;
	        tail = temp;
	    }
}

