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
        enterNumbers(player1);
        enterNumbers(player2);
        clearArrays(player1);
        clearArrays(player2);
    }

    private void enterNumbers(Player player) {
        for (player.setAttempt(0); player.getAttempt() < 10; player.setAttempt(player.getAttempt() + 1)) {
            System.out.print(player.getName() + " введите " + (player.getAttempt()) + "-й элемент массива: ");
            player.setNumbers(scan.nextInt());
            if (compareNumbers(player) == true) {
                break;
            }
        }
    }

    private boolean compareNumbers(Player player) {
        int number = player.getNumbers()[player.getAttempt()];
        if (number == secretNumber && player.getAttempt() <= 9) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + (player.getAttempt() + 1) + " попытки");
               return true;
        } else if (secretNumber > number && player.getAttempt() < 9) {
            System.out.println(player.getName() + " .Введенное вами число меньше того, что загадал компьютер." + " Осталось попыток " + (9 - player.getAttempt()));
            return false;
        } else if (number > secretNumber && player.getAttempt() < 9) {
            System.out.println(player.getName() + " .Введенное вами число больше того, что загадал компьютер." + " Осталось попыток " + (9 - player.getAttempt()));
            return false;
        } else {
            System.out.println("У" + player.getName() + " закончились попытки");
            System.out.println(Arrays.toString(player.getNumbers()));
            return true;
        }
    }

    private void clearArrays(Player player) {
        Arrays.fill(player.clearNumber(), 0, player.getAttempt() + 1, 0);
        System.out.println(Arrays.toString(player.clearNumber()));
    }
}
