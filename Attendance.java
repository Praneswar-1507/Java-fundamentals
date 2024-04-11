package com.task;
import java.util.*;
public class Attendance {

	public static void main(String[] args) {
		int numberOfClasHeld,numberOfClassAttended;
		double percent;
		char medicalCause;
		Scanner attend=new Scanner(System.in);
		System.out.println("Enter number of class held:");
		numberOfClasHeld=attend.nextInt();
		System.out.println("Enter number of class attended");
		numberOfClassAttended=attend.nextInt();
		System.out.println("Enter medical cause(y/n):");
		medicalCause=attend.next().charAt(0);
		percent=(numberOfClassAttended)/(numberOfClasHeld*100);
		System.out.println(percent);
		if(percent>75 || medicalCause=='y')
		{
			System.out.println("Allowed to sit in exam");
		}
		else
		{
			System.out.println("Not allowed to sit");
		}
		

	}

}
