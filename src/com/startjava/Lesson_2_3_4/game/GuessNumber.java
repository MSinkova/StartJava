package com.startjava.Lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private Player player1, player2;
    private Scanner scan;
    private int secretNumber, i;
    private int arrayLength = 10;
    private int[] numbers1 = new int[arrayLength];
    private int[] numbers2 = new int [arrayLength];

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        scan = new Scanner(System.in);
    }

    private int enterNumbers() {
        for (i = 0; i < arrayLength ; i++) {
            System.out.print(player1.getName() + " введите " + (i + 1) + "-й элемент массива: ");
            player1.setNumbers(numbers1);
            numbers1[i]= scan.nextInt();
            if (compareNumbers(player1, player1.getNumbers())== true) {
                break;
            }

            System.out.print(player2.getName() + " введите " + (i + 1) + "-й элемент массива: ");
            player2.setNumbers(numbers2);
            numbers2[i]= scan.nextInt();
            if (compareNumbers(player2, player2.getNumbers()) == true) {
                break;
            }
        }
        return i;
    }

    public void start() {
        secretNumber = (int) (Math.random() * 101);
        System.out.println("Число = " + secretNumber);
        System.out.println("У вас 10 попыток");
        enterNumbers();
        clearArrays();
    }

    private boolean compareNumbers(Player player, int[] numbers) {
            if (player.getNumbers()[i] == secretNumber && i <= 9) {
                System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + (i + 1) + " попытки");
                return true;
            } else if (secretNumber > player.getNumbers()[i] && i < 9) {
                System.out.println(player.getName() + " .Введенное вами число меньше того, что загадал компьютер." + " Осталось попыток " + (9 - i));
                return false;
            } else if (player.getNumbers()[i] > secretNumber && i < 9) {
                System.out.println(player.getName() + " .Введенное вами число больше того, что загадал компьютер." + " Осталось попыток " + (9 - i));
                return false;
            } else {
                System.out.println("У" + player.getName() + " закончились попытки");
                copyNumbers(player, player.getNumbers());
                return true;
            }
    }

    private void copyNumbers(Player player, int[] numbers) {
        numbers = Arrays.copyOf(player.getNumbers(), i);
        System.out.println(Arrays.toString(numbers));
    }

    private void clearArrays() {
        Arrays.fill(player1.getNumbers(),0, i, 0);
        System.out.println(Arrays.toString(player1.getNumbers()));

        Arrays.fill(player2.getNumbers(),0, i, 0);
        System.out.println(Arrays.toString(player2.getNumbers()));
    }
}
