package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	    Scanner scan = new Scanner(System.in);
		String answer;
		do {
			calculator.calculate();
			do {
				System.out.println("Вы хотите продолжить? [да/нет]: ");
				answer = scan.next();
			} while (!answer.equals("нет") && !answer.equals("да"));
		} while (answer.equals("да"));
	}
}  