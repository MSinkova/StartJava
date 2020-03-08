package com.startjava.Lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		String play;
		do {
			System.out.print("Введите первое число : ");
			calculator.setNumber1(scan.nextInt()); 
			System.out.print("Введите знак математической операции: ");
			calculator.setAction(scan.next().charAt(0));
			System.out.print("Введите второе число : ");
			calculator.setNumber2(scan.nextInt());
			calculator.calculate();
			do {
				System.out.println("Вы хотите продолжить? [да/нет]: ");
				play = scan.next(); 
			} while (!play.equals("нет") && !play.equals("да"));
		} while (play.equals("да"));
	}
}  