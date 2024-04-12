package com.task;
import java.util.*;
public class Tax {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your gross salary: ");
		        double grossSalary = scanner.nextDouble();

		        System.out.print("Enter your total savings: ");
		        double totalSavings = scanner.nextDouble();

		        double taxableIncome = grossSalary - Math.min(totalSavings, 100000);
		        double tax = 0;

		        if (taxableIncome > 500000) {
		            tax += (taxableIncome - 500000) * 0.3;
		            taxableIncome = 500000;
		        }

		        if (taxableIncome > 200000) {
		            tax += (taxableIncome - 200000) * 0.2;
		            taxableIncome = 200000;
		        }

		        if (taxableIncome > 100000) {
		            tax += (taxableIncome - 100000) * 0.1;
		        }

		        System.out.println("Your tax is: Rs. " + tax);

		        scanner.close();
		    }
		}

	
