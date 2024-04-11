package Com.task5;

import java.util.*;

public class CabFare {
	public static void main(String[] args) {
		Scanner word = new Scanner(System.in);
		 String userName;
		 int phonenumber;
		 System.out.println("Enter username");
		 userName=word.next();
		 System.out.println("Enter phonenumber");
		 phonenumber=word.nextInt();
		System.out.println("Enter the km:");
		double distance = word.nextDouble();
		while(distance<0)
		{
			System.out.println("Enter Correct value");
			System.out.println("Enter the km:");
			 distance = word.nextDouble();
		}
		System.out.println("Enter cab type:\n1.Micro Rs.10/km\n2.Mini Rs.15/km\n3.Prime Rs.20/km");
		String cabType = word.next();
		while(!cabType.equalsIgnoreCase("micro") && !cabType.equalsIgnoreCase("mini")&& !cabType.equalsIgnoreCase("prime"))
		{
			System.out.println("Enter cab type ");
			cabType=word.next();
		}

		double cabFare = Cab.calculateCabFare(distance, cabType);
		if (cabFare == -1) {
			System.out.println("Invalid cab type");

			return;
		}
		double discount = Cab.Discount(cabFare);
		double amount = cabFare - discount;
		System.out.println("username:"+userName);
		System.out.println("phonenumber:"+phonenumber);
		System.out.println("Cab Fare: Rs." + cabFare);
		System.out.println("Discount applied: Rs." + discount);
		System.out.println("Amount: Rs." + amount);
		word.close();

	}

}
