package com.task;

import java.util.*;

public class Bonus {

	public static void main(String[] args) {
		int yearOfService, bonus, salary, netAmount;
		System.out.println("Enter year of service:");
		Scanner amount = new Scanner(System.in);
		yearOfService = amount.nextInt();
		System.out.println("Enter salary:");
		salary = amount.nextInt();
		if (salary < 0 || yearOfService < 0) {
			System.out.println("Enter positive value");
			System.out.println("Enter year of service:");
			yearOfService = amount.nextInt();
			System.out.println("Enter salary:");
			salary = amount.nextInt();
		}
		if (salary > 0 && yearOfService > 0) {
			if (yearOfService > 5) {

				bonus = salary * 5 / 100;
				netAmount = salary + bonus;
				System.out.println("net bonus amount: " + netAmount);
			} else {
				System.out.println("No Bonus");
			}
		}
	}
}
