/**
 * 
 */
package com.isoft;

import java.util.Scanner;

/**
 * @author Ilian
 *
 */
public class _1_RectangleArea {

	public static void main(String[] args) {
		// TODO Problem 1. Rectangle Area
		// Write a program that enters the sides of a rectangle (two integers a and b) and calculates and prints the rectangle's area. Examples:
		// | Input | Output|
		// | 7 20  | 140   |
		// | 5 12  | 60    |
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please insert side A: ");
		int sideA = Integer.parseInt(scanner.next());
		
		System.out.println("Please insert side B: ");
		int sideB = Integer.parseInt(scanner.next());

		calculate(sideA, sideB);
	}

	private static void calculate(int sideA, int sideB) {
		int rezult = sideA * sideB;
		
		System.out.printf("The rectangle's area is: %d\n", rezult);
	}
}
