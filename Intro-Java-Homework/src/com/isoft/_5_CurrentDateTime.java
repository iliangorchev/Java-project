package com.isoft;

import java.time.LocalDateTime;

public class _5_CurrentDateTime {

	/**
	 * @author Ilian
	 */

	// TODO Problem 5. Print the Current Date and Time
	// Create a simple Java program CurrentDateTime.java to print the current
	// date and time. Submit the Java class CurrentDateTime as part of your
	// homework.

	public static void main(String[] args) {
		LocalDateTime currentDate = LocalDateTime.now();
		System.out.println(currentDate);
	}

}
