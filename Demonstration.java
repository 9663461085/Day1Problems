package com.bridgelabz;

public class Demonstration {
	/*
	 * Declaring Static variables
	 */
	static int a = 10;
	static int b;
	static int c;

	/*
	 * Method to print the values of a,b,c
	 */
	static void method(int c) {
		System.out.println("Value of a=" + a);
		System.out.println("Value of b=" + b);
		System.out.println("Value of c=" + c);

	}

	/*
	 * Block to assign the value of b.
	 */
	static {

		b = 20;
	}

	public static void main(String args[]) {
		/*
		 * Calling the method.
		 */
		method(30);
	}
}
