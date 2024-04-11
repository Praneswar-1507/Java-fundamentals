package com.task;

import java.util.Scanner;

public class TeenNumberChecker {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		System.out.println("Enter the age:");
		int num=word.nextInt();
		System.out.println("Enter the age1:");
		int num1=word.nextInt();
		System.out.println("Enter the age2:");
		int num2=word.nextInt();
		System.out.println("Enter the age3:");
		int num3=word.nextInt();
		
		System.out.println(isTeen(num));
		System.out.println(hasTeen(num1,num2,num3));
	}
	public static boolean hasTeen(int age1,int age2,int age3)
	{
		if(age1>=13 && age1<=19 || age2>=13 && age2<=19 || age3>=13 && age3<=19)
		{
			return true;
		
		}
		return false;
	}
			
				
	
	public static boolean isTeen(int age) {
		if(age>=13 && age<=19)
		{
			return true;
		}
		return false;
	}
}