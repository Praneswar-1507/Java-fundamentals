package com.task2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		String s;
		Scanner word=new Scanner(System.in);
		System.out.println("Enter string:");
		s=word.nextLine();
		StringBuffer a =new StringBuffer(s);
		System.out.println(a.reverse());

	}

}
