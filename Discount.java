package com.task;
import java.util.*;
public class Discount {

	public static void main(String[] args) {
		int quantity,cost;
		double discount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quantity:");
		quantity=sc.nextInt();
		
		if(quantity<0)
		{
			System.out.println("Enter positive value");
			System.out.println("Enter quantity:");
			quantity=sc.nextInt();
		}
		if(quantity>0)
		{
			cost=quantity*100;
		 if(cost>1000)
		{
			 discount=cost-0.1*cost;
			
			System.out.println("cost with discount:"+discount);
		}
		 else
		 {
			 System.out.println("cost without discount:"+cost);
		 }
		     
			
		}

	}

}

