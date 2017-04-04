package com.APass1.rmit;

import java.util.Random;

public abstract class Participant {
	private int ID;
	private String name;
	private int age;
	private String state;
	static Random rm = new Random();
	static int participantNumber = rm.nextInt(7);
	
	public Participant(int ID, String name, int age, String state){

		this.ID = ID;
		this.name = name;
		this.age = age;
		this.state = state;
	}
	
	public int getID() {
		return ID;
	}


	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	public String getState() {
		return state;
	}
	
	public String toString(){
		return "ID:" + ID + ", Age:" + age + ", Name:" + name + ",State:" + state;
	}
}

