package com.isoft;

import java.util.Arrays;
import java.util.Scanner;

public class _8_SortArrayOfStrings {

	/**
	 * @author Ilian
	 */

	// TODO Problem 8. * Sort Array of Strings
	// Write a program that enters from the console number n and n strings, then
	// sorts them alphabetically and prints them. Note: you might need to learn
	// how to use loops and arrays in Java (search in Internet). Examples:
	// Input
	// 5
	// Sofia
	// Plovdiv
	// Varna
	// Pleven
	// Bourgas
	// Output
	// Bourgas
	// Pleven
	// Plovdiv
	// Sofia
	// Varna

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int items = input.nextInt();
		input.nextLine();
		String[] towns = new String[items];
		for (int i = 0; i < items; i++) {
			towns[i] = input.nextLine();
		}
		Arrays.sort(towns);
		for (String town : towns) {
			System.out.println(town);
		}
	}

}
