package com.task2;
import java.util.*;
public class StringMethods {

	public static void main(String[] args) {
		String fir,second;
		Scanner word=new Scanner(System.in);
		System.out.println("Enter fisrt string:");
		fir=word.nextLine();
		System.out.println("Enter second string:");
		second=word.nextLine();
		System.out.println("2 strings are equal or not:"+fir.equals(second));
		System.out.println("Is Blank Or Not:"+fir.isBlank());
		System.out.println("Is Empty Or Not:"+second.isEmpty());


	}

}
