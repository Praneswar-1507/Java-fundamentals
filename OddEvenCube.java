package com.task;
import java.util.*;
public class OddEvenCube {

	public static void main(String[] args) {
		int i,cube;
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        while(n<0)
	        {
	        	System.out.println("Enter positive number");
	        	 System.out.print("Enter a number: ");
	 	         n = scanner.nextInt();
	        }

	        System.out.println("Odd numbers till number " + n );
	        for ( i = 1; i <= n; i++) {
	            if (i % 2 != 0) {
	                System.out.println(i);
	            }
	        }

	        System.out.println("Even numbers till number " + n);
	        for ( i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }
	        System.out.println("cube numbers till number "+n);
	        for( i=0;i<=n;i++)
	        {

	         cube = i * i * i;
	        
	        System.out.println( +i+":^3=" + cube);
	        }
	    }
	}

	
