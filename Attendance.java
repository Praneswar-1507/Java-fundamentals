package com.task;

import java.util.*;

public class Attendance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the total number of classes held: ");
		int totalClasses = scanner.nextInt();
		System.out.print("Enter the number of classes attended: ");
		int attendedClasses = scanner.nextInt();
		System.out.print("Do you have a medical cause? (Y/N): ");
		String hasMedicalCause = scanner.next();
		double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;
		boolean eligibleToSit = attendancePercentage >= 75 || hasMedicalCause.equalsIgnoreCase("Y");
		System.out.println("Percentage of classes attended: " + attendancePercentage + "%");
		if (eligibleToSit) {
			System.out.println("You are allowed to sit in the exam.");
		} else {
			System.out.println("You are not allowed to sit in the exam.");
		}
		scanner.close();
	}
}
