package com.program;
import java.util.*;
public class big {

	public static void main(String[] args) {
	int num1,num2,max;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	num1=sc.nextInt();
	System.out.println("Enter second number");
	num2=sc.nextInt();
	max=num1>num2?num1:num2;
	System.out.println("biggest number="+max);
	

	}

}
