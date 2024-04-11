package com.program;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		int now;
		String hname;
		boolean hasew;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter hospital name");
		hname=sc.next();
		System.out.println("Hospital name: "+hname);
		System.out.println("Enter number of wards");
		now=sc.nextInt();
		System.out.println("No of wards: "+now);
		System.out.println("whether ICU ward is available");
		hasew=sc.nextBoolean();
		System.out.println(hasew);
		

	}

}
