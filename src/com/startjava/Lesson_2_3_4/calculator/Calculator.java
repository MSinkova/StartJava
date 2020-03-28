package com.startjava.Lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {

	private String srcMathExpression;
	private String[] mathExpression = new String[3];

	public void setSrcMathExpression(String srcMathExpression) {
		this.srcMathExpression = srcMathExpression;
	}

	private String[] convertToArray() {
		mathExpression = srcMathExpression.split(" ");
		return mathExpression;
	}

	public void calculate() {
		convertToArray();
		int number1 = Integer.parseInt(mathExpression[0]);
		int number2 = Integer.parseInt(mathExpression[2]);
 		if (mathExpression[1].equals("+")) {
			System.out.println("Ответ = " + addExact(number1, number2));
		} else if (mathExpression[1].equals("-")) {
			System.out.println("Ответ = " + subtractExact(number1, number2));
		} else if (mathExpression[1].equals("*")) {
			System.out.println("Ответ = " + multiplyExact(number1, number2));
		} else if (mathExpression[1].equals("/")) {
			System.out.println("Ответ = " + floorDiv(number1, number2));
		} else  if (mathExpression[1].equals("%")) {
			System.out.println("Ответ = " + IEEEremainder(number1, number2));
		} else if (mathExpression[1].equals("^")) {
			System.out.println("Ответ = " + pow(number1, number2));
		} else {
			System.out.println("Вы ввели математическую операцию не равную: +, -, *, /, ^, %");
		}
	} 
}
