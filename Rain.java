package com.task;

import java.util.*;

public class Rain {

	public static void main(String[] args) {
		char rain;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("whether it is raining?(y/n):");
		rain = sc.next().charAt(0);

		if (rain == 'n') {
			System.out.println("no need of umberlla");
			System.out.println("whether it is raining?(y/n):");
			rain = sc.next().charAt(0);

		}
			if (rain == 'y') {
				System.out.println("Bring Umberlla");
				System.out.println("Enter temperature:");
				temp = sc.nextInt();
			
			    if (temp < 32) {
			    	System.out.println("Bring Heavy Jacket");
			} else if (temp > 32 && temp < 52) {
				System.out.println("Bring Light Jacket or Not At All");
			} else {
				System.out.println("Error");
			}
			}
		}

	}

