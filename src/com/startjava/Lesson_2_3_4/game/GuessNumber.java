package com.startjava.Lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

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
        System.out.println("У вас 10 попыток");
        player1.setAttempt(0);
        player2.setAttempt(0);
        while (player1.getAttempt() < 10 || player2.getAttempt() < 10 ) {
            enterNumbers(player1);
            enterNumbers(player2);
            if (suggest(player1) == false && suggest(player2) == false) {
                player1.setAttempt(player1.getAttempt() + 1);
                player2.setAttempt(player2.getAttempt() + 1);
            } else {
                break;
            }
        }
        player1.clearNumber();
        player2.clearNumber();
    }

    private void enterNumbers(Player player) {
            System.out.print(player.getName() + " введите " + (player.getAttempt()) + "-й элемент массива: ");
            player.setNumber(scan.nextInt());
    }

    private boolean suggest(Player player) {
        int count = player.getAttempt();
        switch (compareNumbers(player)) {
            case (1): System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + (count + 1) + " попытки");
                return true;
            case (2): System.out.println(player.getName() + " .Введенное число < того, что загадал компьютер." + " Осталось попыток " + (9 - count));
                return false;
            case (3): System.out.println(player.getName() + " .Введенное число > того, что загадал компьютер." + " Осталось попыток " + (9 - count));
                return false;
            case (4): System.out.println("У" + player.getName() + " закончились попытки" + Arrays.toString(player.getNumbers()));
                return true;
        }
        return true;
    }

    private int compareNumbers(Player player) {
        int number = player.getNumbers()[player.getAttempt()];
        int count = player.getAttempt();
        if (number == secretNumber && count < 10) {
            return 1;
        } else if (secretNumber > number && count < 9) {
            return 2;
        } else if (number > secretNumber && count < 9) {
            return 3;
        } else {
            return 4;
        }
    }
}
