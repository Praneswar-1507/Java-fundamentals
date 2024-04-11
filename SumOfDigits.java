package com.task;

import java.util.*;

public class SumOfDigits {

	public static void main(String[] args) {
		int num, remainder, sum = 0;
		System.out.println("Enter a number");
		Scanner number = new Scanner(System.in);
		num = number.nextInt();
		if (num < 0) {
			System.out.println("Enter a positive value");
			System.out.println("Enter a number");
			num = number.nextInt();
		}
		while (num> 0) {
			remainder = num % 10;
			sum = sum + remainder;
			num = num / 10;
		}
		System.out.println("Sum of the digit=" + sum);
	}

}
