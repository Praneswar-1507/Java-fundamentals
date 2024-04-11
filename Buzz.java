package com.task;

import java.util.*;

public class Buzz {

	public static void main(String[] args) {
		int num, i;
		System.out.println("Enter a number:");
		Scanner number = new Scanner(System.in);
		num = number.nextInt();
		if (num < 0) {
			System.out.println("Enter a positive value");
			System.out.println("Enter a number:");
			num = number.nextInt();
		}
		for (i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
