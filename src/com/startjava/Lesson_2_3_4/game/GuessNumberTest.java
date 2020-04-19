package com.startjava.Lesson_2_3_4.game;

import com.startjava.Lesson_2_3_4.game.GuessNumber;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите имя первого игрока: ");
		Player firstPlayer = new Player(scan.next());
		System.out.print("Введите имя второго игрока: ");
		Player secondPlayer = new Player(scan.next());
		GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
		String playerAnswer;
		do {
			guessNumber.start();
			do {
				System.out.println("Вы хотите продолжить? [да/нет]");
				playerAnswer = scan.next();
			} while (!playerAnswer.equals("нет") && !playerAnswer.equals("да"));
		} while (playerAnswer.equals("да"));
	}
}