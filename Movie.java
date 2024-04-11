package com.program;
import java.util.*;
public class Movie {

	public static void main(String[] args) {
		int songs;
		double duration;
		String mname,dname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of song:");
		songs=sc.nextInt();
		System.out.println("Number of songs: "+songs);
		System.out.println("Enter movie name:");
		mname=sc.next();
		System.out.println("Movie name: "+mname);
		System.out.println("Enter director name:");
		dname=sc.next();
		System.out.println("Director name: "+dname);
		System.out.println("Enter duration:");
		duration=sc.nextFloat();
		System.out.println("Duration: "+ String.format("%.2f",duration));

	}

}
