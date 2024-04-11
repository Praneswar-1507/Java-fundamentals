package com.program;
import java.util.*;
public class Bank {

	public static void main(String[] args) {
		int anum;
		long mob_no;
		String achoname,bname;
		boolean hasacc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account number:");
		anum=sc.nextInt();
		System.out.println("Account num: "+anum);
		System.out.println("Enter account holder name");
		achoname=sc.next();
		System.out.println("Account holder name: "+achoname);
		System.out.println("Enter bank name:");
		bname=sc.next();
		System.out.println("Bank name: "+bname);
		System.out.println("Enter mobile no");
		mob_no=sc.nextLong();
		System.out.println("Mobile no: "+mob_no);
		System.out.println("whether account is available");
		hasacc=sc.nextBoolean();
		System.out.println(hasacc);

	}

}
