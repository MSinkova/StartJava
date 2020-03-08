package com.startjava.Lesson_2_3.robot;

public class Jaeger {
	
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public String getModelName() {
		return modelName;
	}

	void setModelName(String modelName) {
		if(modelName == "") {
			System.out.println("Пуста строка");
		} else {
			this.modelName = modelName;
		}
	}

	public String getMark() {
		return mark;
	}

	void setMark(String mark) {
		this.mark = mark;
	}

	public float getHeight() {
		return height;
	}

	void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean drift() {
		System.out.println("Вы вошли в дрифт");
		return true;
	}

	public void move() {
		System.out.println("Вы прошли 5 шагов");
	}

	public String scanKaiju() {
		return "nothing";
	}

	public void useVortexCannon() {

	}

	public  String toString() {
		return "modelName = " + modelName + " ,mark = " + mark;
	}
}