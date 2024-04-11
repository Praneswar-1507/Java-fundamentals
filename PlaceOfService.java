package com.task;

import java.util.*;

public class PlaceOfService {

	public static void main(String[] args) {
		char sex, marritalStatus;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sex(M/F)");
		sex = sc.next().charAt(0);
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter marritalStatus");
		marritalStatus = sc.next().charAt(0);
		if(age<0)
		{
			System.out.println("Enter correct age");
			System.out.println("Enter age");
			age = sc.nextInt();
		}
		if(age>0) {
		if (sex == 'F') {
			System.out.println("she will work only in urban areas");
		} else if (sex == 'M') {
			if (age > 20 && age < 40) {
				System.out.println("may work in anywhere");
			} else if (age > 40 && age < 60) {
				System.out.println("he will work in urban areas only");
			}
			else
			{
				System.out.println("Error");
			}
		}

		else {
			System.out.println("Error");
		}

	}

}
}
