package com.APass1.rmit;

import java.util.Random;

public class Participant {
	static int ID;
	private String name;
	private int age;
	private String state;
	private String area;
	private String sport;
	static Random rm = new Random();
	static int participantNumber = rm.nextInt(7);
	
	public Participant(String sport, int ID, String name, int age, String state){
		this.sport = sport;
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.state = state;
	}
	public String getSport(){
		return sport;
	}
	
	public static int getID() {
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

}

