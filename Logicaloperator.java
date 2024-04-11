package com.task;

import java.util.*;

public class Logicaloperator {

	public static void main(String[] args) {
		int a, b;
		Scanner operator = new Scanner(System.in);
		System.out.println("Enter first value");
		a = operator.nextInt();
		System.out.println("Enter second value");
		b = operator.nextInt();
		if (a < 0 && b < 0) {
			System.out.println("Enter positive value");
			System.out.println("Enter first value");
			a = operator.nextInt();
			System.out.println("Enter second value");
			b = operator.nextInt();
		}
		if (a > 0 && b > 0) {
			if (a > b && a >= b) {
				System.out.println("a is big ");
			} else if (a < b && a <= b) {
				System.out.println("b is big ");
			} else if (a == b) {
				System.out.println("a is equal to b");
			} else {
				System.out.println("Not valid");
			}

		}
	}
}
