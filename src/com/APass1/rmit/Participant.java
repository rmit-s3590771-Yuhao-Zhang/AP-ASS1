package com.APass1.rmit;

public class Participant {
	private String ID;
	private String name;
	private int age;
	private String state;
	private String area;
	
	public Participant(String ID, String name, int age, String state){
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.state = state;
	}

	public String getID() {
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

