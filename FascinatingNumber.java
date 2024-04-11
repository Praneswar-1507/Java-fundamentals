package com.task;

import java.util.*;

public class FascinatingNumber {

	public static void main(String[] args) {

		int num, num2, num3;
		Scanner number = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		num = number.nextInt();
		num2 = num * 2;
		num3 = num * 3;
		if(num<0)
		{
			System.out.println("Enter positive value");
			System.out.print("Enter any Number: ");
			num = number.nextInt();
		}

		String str = num + "" + num2 + num3;
		boolean flag = true;

		for (char ch = '1'; ch <= '9'; ch++) {
			int count = 0;

			for (int i = 0; i < str.length(); i++) {
				char ch2 = str.charAt(i);

				if (ch2 == ch)
					count++;
			}
			if (count > 1 || count == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(num + " is a fascinating number.");
		else
			System.out.println(num + " is not a fascinating number.");
	}
}
