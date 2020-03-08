package com.startjava.Lesson_1.calculator;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Введите два числа");
		int number1 = 7; 
		int number2 = 5; 
		System.out.println("Первое число = " + number1);
		System.out.println("Второе число = " + number2);
		if (number1 <= 0 || number2 <= 0) {
			System.out.println("Необходимо ввести целое положительное число");
		} else {
			System.out.println("Выберете математическую операцию : +, -, *, /, ^, % ");
			System.out.println("1 - Сложение");
			System.out.println("2 - Вычитание");
			System.out.println("3 - Умножение");
			System.out.println("4 - Деление");
			System.out.println("5 - Возведение в степень");
			System.out.println("6 - Деление по модулю");
	
			int action = 5;
			int result = 0;
			System.out.println("Вы выбрали " + action);
			if (action == 1) {
				result = number1 + number2;
				System.out.print("Ответ: " + result);
			} else if (action == 2) {
				result = number1 - number2;
				System.out.print("Ответ: " + result);
			} else if (action == 3) {
				result = number1 * number2;
				System.out.print("Ответ: " + result);
			} else if (action == 4) {
				result = number1 / number2;
				System.out.print("Ответ: " + result);
			} else if (action == 5) {
				int involution = 1;
				for (int i = 1; i <= number2; i++) {
					involution *= number1;
				} 
				System.out.print("Ответ: " + involution);	
			} else if (action == 6) {
				result = number1 % number2;
				System.out.print("Ответ: " + result);
			} else {
				System.out.println("Вы ввели математическую операцию не равную: +, -, *, /, ^, % ");
			} 
		}	
	}
}