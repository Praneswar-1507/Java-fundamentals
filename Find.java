package com.task2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find {

	public static void main(String[] args) {
		
		Pattern pattern=Pattern.compile("come");
		Matcher a =pattern.matcher("welcometochainsys");
		while(a.find())
			System.out.println(a.start() + "to" +(a.end()-1  ));

	}

}
