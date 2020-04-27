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
        while (player1.getAttempt() < 10 || player2.getAttempt() < 10) {
            enterNumber(player1);
            if (compareNumber(player1) == true) {
                win(player1);
                break;
            } else {
                enterNumber(player2);
                if (compareNumber(player2) == true) {
                    win(player2);
                    break;
                }
            }
            player1.setAttempt(player1.getAttempt());
            player2.setAttempt(player2.getAttempt());
        }
        stopGame(player1);
        stopGame(player2);
        player1.clearNumbers();
        player2.clearNumbers();
        player1.setZero();
        player2.setZero();
    }

    private void enterNumber(Player player) {
        System.out.print(player.getName() + " введите число: ");
        player.setNumber(scan.nextInt());
    }

    private boolean compareNumber(Player player) {
        int number = player.getNumbers()[player.getAttempt()];
        int count = player.getAttempt();
        if (secretNumber > number) {
            System.out.println(player.getName() + " .Введенное число < того, что загадал компьютер." + " Осталось попыток " + (9 - count));
            return false;
        } else if (secretNumber < number) {
            System.out.println(player.getName() + " .Введенное число > того, что загадал компьютер." + " Осталось попыток " + (9 - count));
            return false;
        } else {
            return true;
        }
    }

    private void win(Player player) {
        int count = player.getAttempt();
        System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + (count + 1) + " попытки");
    }

    private void stopGame(Player player) {
        if (secretNumber != player.getNumbers()[player.getAttempt()] && player.getAttempt() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        System.out.println(Arrays.toString(player.getNumbers()));
    }
}
