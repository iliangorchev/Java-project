package com.isoft;

import java.util.Scanner;

/**
 * @author Ilian
 *
 */
public class _2_TriangleArea {

	public static void main(String[] args) {
		// TODO Problem 2. Triangle Area
		// Write a program that enters 3 points in the plane (as integer x and y
		// coordinates), calculates and prints the area of the triangle composed
		// by these 3 points. Round the result to a whole number. In case the
		// three points do not form a triangle, print "0" as result. Examples:

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter coordinates for point A: ");
		double ax = scanner.nextDouble();
		double ay = scanner.nextDouble();

		System.out.println("Enter coordinates for point B: ");
		double bx = scanner.nextDouble();
		double by = scanner.nextDouble();

		System.out.println("Enter coordinates for point C: ");
		double cx = scanner.nextDouble();
		double cy = scanner.nextDouble();

		double sideA = calculateSides(ax, ay, bx, by);
		double sideB = calculateSides(bx, by, cx, cy);
		double sideC = calculateSides(cx, cy, ax, ay);

		boolean legitimate = formTriangle(sideA, sideB, sideC);
		if (legitimate) {
			double triangleArea = calculateArea(sideA, sideB, sideC);
			double resultRounded = Math.round(triangleArea);
			System.out.printf("%.0f\n", resultRounded);

		} else {
			System.out.println("0");
		}
	}

	private static double calculateArea(double sideA, double sideB, double sideC) {
		double p = (sideA + sideB + sideC) / 2.0;
		double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

		return area;
	}

	private static boolean formTriangle(double sideA, double sideB, double sideC) {
		boolean formTriangle = (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);

		return formTriangle;
	}

	private static double calculateSides(double ax, double ay, double bx, double by) {
		double side = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));

		return side;
	}

}
