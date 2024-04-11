package com.task;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		int n,i,j,k;
		Scanner number=new Scanner(System.in); 
		System.out.println("Enter a number:");
		n=number.nextInt();
		if (n < 0) {
			System.out.println("Enter a positive value");
			System.out.println("Enter a number:");
			n=number.nextInt();
		}
		for(i=n;i>0;i--)
		{
			for(j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<2*i-1;k++)
			{
				if(k%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}
