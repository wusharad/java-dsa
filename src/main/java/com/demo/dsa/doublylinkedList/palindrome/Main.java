package com.demo.dsa.doublylinkedList.palindrome;

public class Main {
	public static void main(String[] args) {

		DoublyLinkedList myDLL1 = new DoublyLinkedList(1);
		myDLL1.append(2);
		myDLL1.append(3);
		myDLL1.append(2);
		myDLL1.append(1);

		System.out.println("myDLL1 isPalindrome:");
		System.out.println(myDLL1.isPalindrome());

		DoublyLinkedList myDLL2 = new DoublyLinkedList(1);
		myDLL2.append(2);
		myDLL2.append(3);

		System.out.println("\nmyDLL2 isPalindrome:");
		System.out.println(myDLL2.isPalindrome());
	}

}
