package com.task2;
import java.util.*;
public class UpperCaseLowerCase {

	public static void main(String[] args) {
		String value;
		Scanner word=new Scanner(System.in);
		System.out.println("Enter a string:");
		value=word.nextLine();
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());

	}

}
