package com.APass1.rmit;

import java.util.*;

class Athlete extends Participant{
	public Athlete(String sport, int ID, String name, int age, String state){
		super(sport, ID, name, age, state);
	}
	static ArrayList<Athlete> Athlete = new ArrayList<Athlete>();
	
	public static void AddAthlete(){//insert athletes
		Athlete.add(new Swimmer("swim", 0, "Matt", 17, "QL"));
		Athlete.add(new Swimmer("swim", 1, "Ivy", 18, "TS"));
		Athlete.add(new Swimmer("swim", 2, "Tony", 22, "VIC"));
		Athlete.add(new Swimmer("swim", 3, "Jack", 21, "SA"));
		Athlete.add(new Swimmer("swim", 4, "Mark",  24, "NSW"));
		Athlete.add(new Swimmer("swim", 5, "James", 29, "VIC"));
		Athlete.add(new Swimmer("swim", 6, "Lily",  22, "VIC"));
		Athlete.add(new Sprinter("sprint", 7, "Rachel",  22, "QL"));
		Athlete.add(new Sprinter("sprint", 8, "Thomas", 18, "TS"));
		Athlete.add(new Sprinter("sprint", 9, "Daniel", 25,"VIC"));
		Athlete.add(new Sprinter("sprint", 10, "Paul", 26,"SA"));
		Athlete.add(new Sprinter("sprint", 11, "Amy", 18, "NSW"));
		Athlete.add(new Sprinter("sprint", 12, "Sarah", 25,"VIC"));
		Athlete.add(new Sprinter("sprint", 13, "Jennifer", 26,"VIC"));
		Athlete.add(new SuperAthlete("sport", 14, "Linda", 23,"QL"));
		Athlete.add(new SuperAthlete("sport", 15, "Candy", 24,"VIC"));
		Athlete.add(new SuperAthlete("sport", 16, "Eric", 18,"NSW"));
		Athlete.add(new SuperAthlete("sport", 17, "Jason", 20,"TS"));
		Athlete.add(new SuperAthlete("sport", 18, "William", 22,"NSW"));
		Athlete.add(new SuperAthlete("sport", 19, "Angela", 24,"SA"));
		Athlete.add(new SuperAthlete("sport", 20, "Jenny", 19,"VIC"));
		Athlete.add(new SuperAthlete("sport", 21, "Jessica", 20,"SA"));
		Athlete.add(new SuperAthlete("sport", 22, "Chris", 27,"VIC"));
		Athlete.add(new SuperAthlete("sport", 23, "Emily", 26,"VIC"));
		Athlete.add(new Cyclist("cycling", 24,"Sunny", 21,"QL"));
		Athlete.add(new Cyclist("cycling", 25,"David", 17,"NSW"));
		Athlete.add(new Cyclist("cycling", 26,"Jessica", 19,"TS"));
		Athlete.add(new Cyclist("cycling", 27,"Lisa", 24,"VIC"));
		Athlete.add(new Cyclist("cycling", 28,"George", 27,"NSW"));
		Athlete.add(new Cyclist("cycling", 29,"Kevin", 19,"VIC"));
		Athlete.add(new Cyclist("cycling", 30 ,"Eva", 17,"VIC"));
	}
	
	public ArrayList getAthlete(){
		return Athlete;
		
	}
	public static void randomParticipants(){

		
	}
	
}
