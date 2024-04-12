package com.task;
import java.util.*;
public class Quit {

	public static void main(String[] args) {
		int sum=0,product=1,count=0;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter an integer(press 'q' to quit):");
			if(sc.hasNextInt())
			{
				int num=sc.nextInt();
				sum+=num;
				product*=num;
				count++;
			}
			else
			{
				String input =sc.next();
				if(input.equalsIgnoreCase("q"))
				{
					break;
				}
				else
				{
					System.out.println("Invalid input.Please enter an integer or 'q' to quit");
				}
			}
		}
		double average=count== 0 ? 0: (double) sum/count;
		System.out.println("Average="+average);
		System.out.println("Product="+product);
	}
}
		
		


