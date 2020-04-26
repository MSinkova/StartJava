package com.startjava.Lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

	private String name;
	private int attempt;
	private int[] numbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAttempt() {
		return attempt;
	}

	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}

	public int[] getNumbers() {
		return Arrays.copyOf(numbers, attempt + 1);
	}

	public void setNumber(int number) {
		numbers[attempt] = number;
	}

	public void clearNumber() {
		Arrays.fill(numbers, 0, attempt +1 , 0);
	}
}