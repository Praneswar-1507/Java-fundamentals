package com.task;

public class Expressions {

	public static void main(String[] args) {
		int x = 2, y = 3, z = 0;
		System.out.println("x==2:" + (x == 2));
		System.out.println("x!=5:" + (x != 5));
		System.out.println("x!=5 && y>=5:" + (x != 5 && y >= 5));
		System.out.println("z != 0 || x == 2:" + (z != 0 || x == 2));
		System.out.println("!(y < 10):" + !(y < 10));

	}

}
