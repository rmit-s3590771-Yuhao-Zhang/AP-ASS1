package com.APass1.rmit;

import java.util.ArrayList;

class Athlete extends Participant{
	public Athlete(String ID, String name, int age, String state){
		super(ID, name, age, state);
	}
	static ArrayList<Athlete> Athlete = new ArrayList<Athlete>();
	
	public static void AddAthlete(){//insert athletes
		Athlete.add(new Swimmer("swim0001", "Matt", 17, "QL"));
		Athlete.add(new Swimmer("swim0002", "Ivy", 18, "TS"));
		Athlete.add(new Swimmer("swim0003", "Tony", 22, "VIC"));
		Athlete.add(new Swimmer("swim0004",  "Jack", 21, "SA"));
		Athlete.add(new Swimmer("swim0005", "Mark",  24, "NSW"));
		Athlete.add(new Swimmer("swim0006", "James", 29, "VIC"));
		Athlete.add(new Swimmer("swim0007","Lily",  22, "VIC"));
		Athlete.add(new Sprinter("sprint0001", "Rachel",  22, "QL"));
		Athlete.add(new Sprinter("sprint0002", "Thomas", 18, "TS"));
		Athlete.add(new Sprinter("sprint0003", "Daniel", 25,"VIC"));
		Athlete.add(new Sprinter("sprint0004", "Paul", 26,"SA"));
		Athlete.add(new Sprinter("sprint0005", "Amy", 18, "NSW"));
		Athlete.add(new Sprinter("sprint0006", "Sarah", 25,"VIC"));
		Athlete.add(new Sprinter("sprint0007", "Jennifer", 26,"VIC"));
		Athlete.add(new Cyclist("cycling0001","Sunny", 21,"QL"));
		Athlete.add(new Cyclist("cycling0002","David", 17,"NSW"));
		Athlete.add(new Cyclist("cycling0003","Jessica", 19,"TS"));
		Athlete.add(new Cyclist("cycling0004","Lisa", 24,"VIC"));
		Athlete.add(new Cyclist("cycling0005","George", 27,"NSW"));
		Athlete.add(new Cyclist("cycling0006","Kevin", 19,"VIC"));
		Athlete.add(new Cyclist("cycling0007","Eva", 17,"VIC"));
		Athlete.add(new SuperAthlete("super0001",  "Linda", 23,"QL"));
		Athlete.add(new SuperAthlete("super0002",  "Candy", 24,"VIC"));
		Athlete.add(new SuperAthlete("super0003",  "Eric", 18,"NSW"));
		Athlete.add(new SuperAthlete("super0004",  "Jason", 20,"TS"));
		Athlete.add(new SuperAthlete("super0005",  "William", 22,"NSW"));
		Athlete.add(new SuperAthlete("super0006",  "Angela", 24,"SA"));
		Athlete.add(new SuperAthlete("super0007",  "Jenny", 19,"VIC"));
		Athlete.add(new SuperAthlete("super0008",  "Jessica", 20,"SA"));
		Athlete.add(new SuperAthlete("super0009",  "Chris", 27,"VIC"));
		Athlete.add(new SuperAthlete("super0010",  "Emily", 26,"VIC"));
	}
	
}
