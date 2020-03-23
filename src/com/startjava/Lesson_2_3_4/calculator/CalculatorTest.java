package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		String play;
		do {
			System.out.println("Введите математическое выражение: ");
			calculator.setMathExpression(scan.nextLine());
			calculator.calculate();
			do {
				System.out.println("Вы хотите продолжить? [да/нет]: ");
				play = scan.next(); 
			} while (!play.equals("нет") && !play.equals("да"));
		} while (play.equals("да"));
	}
}  