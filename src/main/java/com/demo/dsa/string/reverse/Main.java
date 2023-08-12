package com.demo.dsa.string.reverse;

public class Main {

	/**
	 * Without creating another string object
	 * 
	 */
	public static String reverseString_withoutNewString(String s) {
		if (s.isBlank())
			return null;
		int len = s.length();
		int index = 0;
		for (int i = len - 1; i >= 0; i--) {
			char c = s.charAt(len - 1);
			s = s.substring(0, index) + c + s.substring(index, len - 1);
			index++;
		}
		return s;
	}

	/**
	 * By creating another string object
	 */
	public static String reverseString(String s) {
		String reverseStr = "";
		if (s.isBlank())
			return null;
		char[] arr = s.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			reverseStr = reverseStr + arr[i];
		}
		return reverseStr;
	}

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println("String =[" + s + "] ; Reverse = " + reverseString_withoutNewString(s));
	}

}
