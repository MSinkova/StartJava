package com.startjava.Lesson_1.game;

public class MyFirstGame {

	public static void main(String[] args) {
		System.out.println("Угадайте число (от 0 до 100)");
		int guessNumber = 89;
		int enterNumber = 87;
		do { 
			System.out.println("Введите число:" + enterNumber);
			if(enterNumber < guessNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				enterNumber++;
			} else {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				enterNumber--;
			}
		} while(enterNumber != guessNumber);
		System.out.println("Вы угадали!");
	}
}