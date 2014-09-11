package com.isoft;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ilian
 *
 */

public class _6_FormattingNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();
		String aInBinaryString = Integer.toBinaryString(a);
		int aInBinary = Integer.parseInt(aInBinaryString);
		System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a, aInBinary, b, c);

	}
}
