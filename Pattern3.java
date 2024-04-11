package com.task;

import java.util.*;

public class Pattern3 {

	public static void main(String[] args) {
		int i, j, k, n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n < 0) {
			System.out.println("Enter a positive value");
		}
		for (i = 0; i < n; i = i + 2) {
			for (j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = n; i > 0; i--) {
			for (j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
