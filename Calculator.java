package com.program;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		double num1,num2,output;
		char operator;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=input.nextDouble();
		System.out.print("Enter an operator (+, -, *, /): ");
	    operator = input.next().charAt(0);
	    System.out.print("Enter second number: ");
        num2 = input.nextDouble();
        switch (operator) {
        case '+':
            output = num1 + num2;
            break;
        case '-':
            output = num1 - num2;
            break;
        case '*':
            output = num1 * num2;
            break;
        case '/':
            if (num2 != 0) 
            {
                output = num1 / num2;
            } 
            else 
            {
                System.out.println("Division by zero is not allowed.");
                return;
            }
            break;
        default:
            System.out.println("Invalid operator");
            return;
    }

    System.out.println("Output: " + output);
}
}


