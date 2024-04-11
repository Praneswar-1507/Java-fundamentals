package com.program;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		int reg_no;
		long mob_no;
		String sname;
		float per;
		boolean hasstatus;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name:");
		sname=sc.next();
		System.out.println("Student name "+sname);
		System.out.println("Enter register no:");
		reg_no=sc.nextInt();
		System.out.println("Register no: "+reg_no);
		System.out.println("Enter mobile no:");
		mob_no=sc.nextLong();
		System.out.println("Mobile no: "+mob_no);
		System.out.println("Enter Percentage: ");
		per=sc.nextFloat();
		System.out.println("Percentage: "+ String.format("%.2f",per));
		System.out.println("whether the student is pass or fail:");
		hasstatus=sc.nextBoolean();
		System.out.println(hasstatus);		

	}

}
