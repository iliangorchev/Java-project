package com.isoft;

import java.util.Scanner;

public class _6_SumTwoNumbers {

	/**
	 * @author Ilian
	 */

	// TODO Problem 6. Sum Two Numbers
	// Write a program SumTwoNumbers.java that enters two integers from the
	// console, calculates and prints their sum. Search in Internet to learn how
	// to read numbers from the console. Examples:
	// A b Result
	// 5 2 8
	// 12 -7 5

	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Please insert number A:");
		int a = scanner.nextInt();
		System.out.println("Please insert number B:");
		int b = scanner.nextInt();

		System.out.println("Result:");
		System.out.println(a + b);
	}

}
