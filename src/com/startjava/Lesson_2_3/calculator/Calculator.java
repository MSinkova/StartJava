package com.startjava.Lesson_2_3.calculator;

public class Calculator {

	private int number1;
	private int number2;
	private char action;
	private int result;

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public char getAction() {
		return action;
	}

	public void setAction(char action) {
		this.action = action;
	}

	public int getResult() {
		return result;
	}

	public int calculate() {
		switch (action) {
		 	case '+': 
		 		System.out.println("Ответ = " + (number1 + number2));
		 		break;
		 	case '-':
		 		System.out.println("Ответ = " + (number1 - number2));
		 		break;
		 	case '*':
		 		System.out.println("Ответ = " + (number1 * number2));
		 		break;
		 	case '/':
		 		System.out.println("Ответ = " + (number1 / number2));
		 		break;
		 	case '%':
		 		System.out.println("Ответ = " + (number1 % number2));
		 		break;
			case '^':
				result = 1;
				for (int i = 0; i < number2; i++) { 
					result *= number1;
				} 
				System.out.println("Ответ = " + result);
		 		break;
		 	default: 
		 		System.out.println("Вы ввели математическую операцию не равную: +, -, *, /, ^, %"); 
		}
		return result;
	} 
}
