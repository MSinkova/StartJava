package com.startjava.Lesson_2_3.robot;

public class JaegerTest {
	
	public static void main(String[] args) {
		Jaeger chernoAlpha = new Jaeger();
		chernoAlpha.setModelName("Cherno Alpha");
		chernoAlpha.setMark("mark - 1");
		chernoAlpha.setHeight(280f);
		chernoAlpha.setWeight(2.412f);
		System.out.println(chernoAlpha.toString());
		System.out.println("height = " + chernoAlpha.getHeight());
		System.out.println("weight = " + chernoAlpha.getWeight());

		Jaeger strikerEureka = new Jaeger();
		strikerEureka.setModelName("Striker Eureka");
		strikerEureka.setMark("mark - 5");
		strikerEureka.setHeight(250f);
		strikerEureka.setWeight(1.850f);
		System.out.println("modelName = " + strikerEureka.getModelName());
		System.out.println("mark = " + strikerEureka.getMark());
		System.out.println("height = " + strikerEureka.getHeight());
		System.out.println("weight = " + strikerEureka.getWeight());
	}
}