package com.isoft;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Ilian
 *
 */

public class _7_Count_of_Bits_One {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.setMinimumFractionDigits(10);
		System.out.println("Enter number: ");
		int number = scanner.nextInt();
		System.out.println(decimalFormat.format(Integer.toBinaryString(number)));
		System.out.println(Integer.bitCount(number));
	}

	public static void bitCounter(int number) {
		String binaryNumber = Integer.toBinaryString(number);
		
		System.out.println(binaryNumber);
	}

}
