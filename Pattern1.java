package com.task;

import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		int n, i, j;
		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = pattern.nextInt();
		if (n < 0) {
			System.out.println("Enter a positive value");
			System.out.println("Enter a number:");
			n = pattern.nextInt();
		}
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
