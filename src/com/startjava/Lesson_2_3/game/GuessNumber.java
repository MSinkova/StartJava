package com.startjava.Lesson_2_3.game;

import java.util.Scanner; 
import java.util.Random;

public class GuessNumber {
	
	private Player player1, player2;
	private Scanner scan;
	private int secretNumber;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		scan = new Scanner(System.in);
	}

	public void start() {
		secretNumber = (int) (Math.random() * 101);
		System.out.println("Число = " + secretNumber);
		do {
			enterNumber(player1);
			enterNumber(player2);
		} while (!compareNumbers(player1) && !compareNumbers(player2));
	}

	private void enterNumber(Player player) {
		System.out.println(player.getName() + " ,введите число от 1 до 100");
		player.setNumber(scan.nextInt());
	}

	private boolean compareNumbers(Player player) {
		if (secretNumber == player.getNumber()) {
			System.out.println(player.getName() + ". Победа!");
			return true;
		} else if (secretNumber > player.getNumber()) {
			System.out.println(player.getName() + " .Введенное вами число меньше того, что загадал компьютер");	
		} else {
			System.out.println(player.getName() + " .Введенное вами число больше того, что загадал компьютер");
		}
		return false;
	}
}
