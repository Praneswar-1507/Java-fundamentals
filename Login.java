package com.task2;

import java.util.*;
import java.util.regex.*;

public class Login {

	public static void main(String[] args) {
		String email, phoneNumber, password;
		Scanner word = new Scanner(System.in);
		String emailCheck = "^[\\w-+\\.]*[\\w]\\@([\\w-_+\\.]+[\\w]$)";
		System.out.println("Enter the emailid:");
		email = word.next();
		Pattern pattern = Pattern.compile(emailCheck);
		while (!pattern.matches(emailCheck, email)) {
			System.out.println("Enter correct emailid");
			email = word.next();
		}
		String passwordCheck = "^(?=.*[a-z])(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%]).{7}$";
		System.out.println("Enter password:");
		password = word.next();
		Pattern pattern1 = Pattern.compile(passwordCheck);
		while (!pattern1.matches(passwordCheck, password)) {
			System.out.println("Enter correct password(password must contain atleast one uppercase,one lowercase,one symbol,one digit");
			password = word.next();

		}
		String phoneNumberCheck="^[0-9]{10}$";
		System.out.println("Enter phoneNumber:");
		phoneNumber = word.next();
		Pattern pattern2=Pattern.compile(phoneNumberCheck);
		while(!pattern2.matches( phoneNumberCheck,phoneNumber))
		{
			System.out.println("Enter correct phonenumber");
			phoneNumber = word.next();
		}

		

		System.out.println("Successfully login");

	}

}
