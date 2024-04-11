package com.task;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int n, i, j, num, ans;
		Scanner table = new Scanner(System.in);
		System.out.println("Enter a number");
		n = table.nextInt();
		System.out.println("Enter a num");
		num = table.nextInt();
		if (n < 0 || num < 0) {
			System.out.println("Enter positive value");
			System.out.println("Enter a number");
			n = table.nextInt();
			System.out.println("Enter a Table");
			num = table.nextInt();
		}

		for (i = 1; i <= n; i++) {
			ans = i * num;
			System.out.println(i + "*" + num + "=" + i * num);
		}

	}

}
