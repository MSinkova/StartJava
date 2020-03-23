package com.startjava.Lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {

	private String mathExpression;
	private char[] action = new char[3];
	private int[] numbers = new int[2];

	public void setMathExpression(String mathExpression) {
		this.mathExpression = mathExpression;
	}

	private int[] parsExpression(String mathExpression) {
		String[] numb = mathExpression.split("[+-/*^%]", 2);
		int[] numbers = new int[numb.length];
		for (int i = 0; i < numb.length; i++) {
			numbers[i] = Integer.parseInt(numb[i]);
		}
		return numbers;
	}

	private char[] convertSymbol(String mathExpression) {
		action =  mathExpression.toCharArray();
//		this.action = new char[] action;
//		action = convertSymbol();
		return action;
	}

	public void calculate() {
		for (int i = 0; i < action.length; i++) {
			System.out.println("Элемент [" + i + "]" + action[i]);
		}
		parsExpression(mathExpression);
		convertSymbol(mathExpression);
		switch (action[1]) {
		 	case '+': 
		 		System.out.println("Ответ = " + addExact(numbers[0], numbers[1]));
		 		break;
		 	case '-':
		 		System.out.println("Ответ = " + subtractExact(numbers[0], numbers[1]));
		 		break;
		 	case '*':
		 		System.out.println("Ответ = " + multiplyExact(numbers[0], numbers[1]));
		 		break;
		 	case '/':
		 		System.out.println("Ответ = " + floorDiv(numbers[0], numbers[1]));
		 		break;
		 	case '%':
		 		System.out.println("Ответ = " + IEEEremainder(numbers[0], numbers[1]));
		 		break;
			case '^':
				System.out.println("Ответ = " + pow(numbers[0], numbers[1]));
		 		break;
		 	default: 
		 		System.out.println("Вы ввели математическую операцию не равную: +, -, *, /, ^, %"); 
		}
	} 
}
