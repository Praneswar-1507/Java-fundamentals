package com.task2;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex1 {

	public static void main(String[] args) {
		String input="fizz buzz buzz fizz buzz ";
		Pattern pattern=Pattern.compile("buzz");
		Matcher matcher=pattern.matcher(input);
		input=matcher.replaceFirst("fizz");
		System.out.println("Replacing first:"+input);
		input=matcher.replaceAll("fizz");
		System.out.println("Replacing all:"+input);
		

	}

}
