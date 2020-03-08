package com.startjava.Lesson_1.unicode;

public class Unicode {
	
	public static void main(String[] args) {
		char start = 33;
		char end = 126;
		for (char i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
	}
}