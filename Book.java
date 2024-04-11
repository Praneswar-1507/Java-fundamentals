package com.program;
import java.util.*;
public class Book {

	public static void main(String[] args) {
		int nop,yop;
		String bname,aname;
		Scanner cs=new Scanner(System.in);
		System.out.println("Enter the book name");
		bname=cs.next();
		System.out.println("Book name: "+bname);
		System.out.println("Enter author name:");
		aname=cs.next();
		System.out.println("Author name: "+aname);
		System.out.println("Enter number of pages");
		nop=cs.nextInt();
		System.out.println("Number of pages: "+nop);
		System.out.println("Enter year of publish");
		yop=cs.nextInt();
		System.out.println("Year of publish: "+yop);

	}

}
