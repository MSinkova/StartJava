package com.startjava.Lesson_2_3_4.array;

import java.util.Scanner;

import static java.lang.Math.*;

public class Calculator {
    private String strtype; // ВВеденое выражение
    private Scanner scan = new Scanner(System.in);

    public void calculator() {
        System.out.println("Введите математическое выражение: ");
        strtype = scan.nextLine();
        String[] numb = strtype.split("[+-/*^%]", 2);
        int[] numbers = new int[numb.length];
        for (int i = 0; i < numb.length; i++) {
            numbers[i] = Integer.parseInt(numb[i]);
        }
        String[] operator = strtype.split("\\d+");
        for (int i = 1; i < operator.length; i++);
        if (operator[1].equals("+")){
            System.out.println("Ответ = " + addExact(numbers[0], numbers[1]));
        } else if (operator[1].equals("-")){
            System.out.println("Ответ = " + subtractExact(numbers[0], numbers[1]));
        } else if (operator[1].equals("/")){
            System.out.println("Ответ = " + floorDiv(numbers[0], numbers[1]));
        } else if(operator[1].equals("*")) {
            System.out.println("Ответ = " + multiplyExact(numbers[0], numbers[1]));
        } else if(operator[1].equals("%")) {
            System.out.println("Ответ = " + IEEEremainder(numbers[0], numbers[1]));
        } else {
            System.out.println("Ответ = " + pow(numbers[0], numbers[1]));
        }
    }
}
