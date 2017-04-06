package com.APass1.SamadikunSuryaKongoasa;


public  class Athlete{
	
	private String name;
	private int age;
	private String state;
	private int points = 0;
	private int athleteID;
	private int time = 0;
	

	
	public Athlete(int athleteID, String name, int age, String state){
		this.athleteID=athleteID;
		this.name=name;
		this.age=age;
		this.state=state;
	}
	
	public void compete(int ID){
		switch(ID){
		case 0:
			time = (int)(101*Math.random()+100);
			break;
		case 1:
			time = (int)(10*Math.random()+11);
			break;
		case 2:
			time = (int)(301*Math.random()+500);
			break;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAthleteID() {
		return athleteID;
	}
	public void setAthleteID(int athleteID) {
		this.athleteID = athleteID;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPoint(){
		return points;
	}
	
	public void setPoints(int points){
		this.points += points;
	}
	
}
