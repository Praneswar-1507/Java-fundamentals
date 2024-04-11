package com.task;

import java.util.*;

public class EvenDigit {

	public static void main(String[] args) {
		int n, rem;
		Scanner even = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = even.nextInt();
		if (n < 0) {
			System.out.println("Enter a positive value");
			System.out.println("Enter a number:");
			n = even.nextInt();
		}
		while (n > 0) {
			rem = n % 10;
			if (rem % 2 == 0) {
				System.out.println(rem);
			}
			n = n / 10;
		}

	}

}
