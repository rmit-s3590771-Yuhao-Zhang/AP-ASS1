package com.APass1.rmit;

import java.util.*;

public abstract class Athlete extends Participant{
	private int points = 0;
	public Athlete(int ID, String name, int age, String state){
		super(ID, name, age, state);
	}
	static ArrayList<Athlete> Athlete = new ArrayList<Athlete>();
	
	
	public static void AddAthlete(){//insert athletes
		Athlete.add(new Swimmer( 0, "Matt", 17, "QL"));
		Athlete.add(new Swimmer( 1, "Ivy", 18, "TS"));
		Athlete.add(new Swimmer( 2, "Tony", 22, "VIC"));
		Athlete.add(new Swimmer( 3, "Jack", 21, "SA"));
		Athlete.add(new Swimmer( 4, "Mark",  24, "NSW"));
		Athlete.add(new Swimmer( 5, "James", 29, "VIC"));
		Athlete.add(new Swimmer( 6, "Lily",  22, "VIC"));
		Athlete.add(new Sprinter( 7, "Rachel",  22, "QL"));
		Athlete.add(new Sprinter( 8, "Thomas", 18, "TS"));
		Athlete.add(new Sprinter( 9, "Daniel", 25,"VIC"));
		Athlete.add(new Sprinter( 10, "Paul", 26,"SA"));
		Athlete.add(new Sprinter( 11, "Amy", 18, "NSW"));
		Athlete.add(new Sprinter( 12, "Sarah", 25,"VIC"));
		Athlete.add(new Sprinter( 13, "Jennifer", 26,"VIC"));
		Athlete.add(new SuperAthlete( 14, "Linda", 23,"QL"));
		Athlete.add(new SuperAthlete( 15, "Candy", 24,"VIC"));
		Athlete.add(new SuperAthlete( 16, "Eric", 18,"NSW"));
		Athlete.add(new SuperAthlete( 17, "Jason", 20,"TS"));
		Athlete.add(new SuperAthlete( 18, "William", 22,"NSW"));
		Athlete.add(new SuperAthlete( 19, "Angela", 24,"SA"));
		Athlete.add(new SuperAthlete( 20, "Jenny", 19,"VIC"));
		Athlete.add(new SuperAthlete( 21, "Jessica", 20,"SA"));
		Athlete.add(new SuperAthlete( 22, "Chris", 27,"VIC"));
		Athlete.add(new SuperAthlete( 23, "Emily", 26,"VIC"));
		Athlete.add(new Cyclist( 24,"Sunny", 21,"QL"));
		Athlete.add(new Cyclist( 25,"David", 17,"NSW"));
		Athlete.add(new Cyclist( 26,"Jessica", 19,"TS"));
		Athlete.add(new Cyclist( 27,"Lisa", 24,"VIC"));
		Athlete.add(new Cyclist( 28,"George", 27,"NSW"));
		Athlete.add(new Cyclist( 29,"Kevin", 19,"VIC"));
		Athlete.add(new Cyclist( 30,"Eva", 17,"VIC"));
	}
	
	
	public void addPoint(int points){
		this.points += points;
	}
	
	public int getPoint(){
		return points;
	}
	
	public void setPoints(int points){
		this.points = points;
	}
	
}
