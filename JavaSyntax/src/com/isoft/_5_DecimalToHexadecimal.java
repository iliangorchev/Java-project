package com.isoft;

import java.util.Scanner;

/**
 *@author Ilian 
 */

public class _5_DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		decimalToHexadecimal(number);
	}

	public static void decimalToHexadecimal(int number) {
		int remainder = 0;
		String hexadecimal = " ";
		while (number > 0) {
			remainder = number % 16;
			switch (remainder) {
			case 0:
				hexadecimal += "0";
				break;
			case 1:
				hexadecimal += "1";
				break;
			case 2:
				hexadecimal += "2";
				break;
			case 3:
				hexadecimal += "3";
				break;
			case 4:
				hexadecimal += "4";
				break;
			case 5:
				hexadecimal += "5";
				break;
			case 6:
				hexadecimal += "6";
				break;
			case 7:
				hexadecimal += "7";
				break;
			case 8:
				hexadecimal += "8";
				break;
			case 9:
				hexadecimal += "9";
				break;
			case 10:
				hexadecimal += "A";
				break;
			case 11:
				hexadecimal += "B";
				break;
			case 12:
				hexadecimal += "C";
				break;
			case 13:
				hexadecimal += "D";
				break;
			case 14:
				hexadecimal += "E";
				break;
			case 15:
				hexadecimal += "F";
				break;
			default:
				break;
			}
			number = number / 16;
		}
		String output = new StringBuilder(hexadecimal).reverse().toString();
		System.out.println(output);
	}

}
