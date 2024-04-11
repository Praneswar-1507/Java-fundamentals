package com.task2;
import java.util.regex.*;
public class Regex2 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}","abDc9"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}","abcDefgs"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}","adfg$"));
		System.out.println(Pattern.matches("[789]\\d{9}","8456789677"));



	}

}
