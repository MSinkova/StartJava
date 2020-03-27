package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

import static java.lang.Math.*;

public class Calculator {

	private String mathExpression;
	private String[] srcMathExpression = new String[3];

	private String[] srcMathExpression() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите математическое выражение: ");
		mathExpression = scan.nextLine();
		srcMathExpression = mathExpression.split("");
		return srcMathExpression;
	}

	public void calculate() {
		srcMathExpression();
 		if (srcMathExpression[1].equals("+")) {
			System.out.println("Ответ = " + addExact(Integer.parseInt(srcMathExpression[0]), Integer.parseInt(srcMathExpression[2])));
		} else if (srcMathExpression[1].equals("-")) {
			System.out.println("Ответ = " + subtractExact(Integer.parseInt(srcMathExpression[0]), Integer.parseInt(srcMathExpression[2])));
		} else if (srcMathExpression[1].equals("*")) {
			System.out.println("Ответ = " + multiplyExact(Integer.parseInt(srcMathExpression[0]), Integer.parseInt(srcMathExpression[2])));
		} else if (srcMathExpression[1].equals("/")) {
			System.out.println("Ответ = " + floorDiv(Integer.parseInt(srcMathExpression[0]), Integer.parseInt(srcMathExpression[2])));
		} else  if (srcMathExpression[1].equals("%")) {
			System.out.println("Ответ = " + IEEEremainder(Integer.parseInt(srcMathExpression[0]), Integer.parseInt(srcMathExpression[2])));
		} else if (srcMathExpression[1].equals("^")) {
			System.out.println("Ответ = " + pow(Integer.parseInt(srcMathExpression[0]), Integer.parseInt(srcMathExpression[2])));
		} else {
			System.out.println("Вы ввели математическую операцию не равную: +, -, *, /, ^, %");
		}
	} 
}
