package com.isoft;

import java.util.Scanner;

/**
 * @author Ilian
 *
 */
public class _8_CountEqualBitPairs {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
 
        int counter = 0;
        String binary = Integer.toBinaryString(number);
        for (int i = 0; i < binary.length() - 1; i++) {
            if (binary.charAt(i) == binary.charAt(i + 1)) {
                counter++;
            }
        }
 
        System.out.println(counter);
	}

}
