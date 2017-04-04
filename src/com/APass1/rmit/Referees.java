package com.APass1.rmit;

import java.util.ArrayList;

class Referees extends Participant{
	public Referees(String sport, int ID, String name, int age, String state){
		super(sport, ID, name, age, state);
	}
	static ArrayList<Referees> Referees = new ArrayList<Referees>();
	
	public static void AddReferees(){//insert referees
		Referees.add(new Referees("Referees", 1, "Elizabeth", 35, "VIC"));
		Referees.add(new Referees("Referees", 2, "Michael", 39, "NSW"));
		Referees.add(new Referees("Referees", 3, "Tom", 43, "QL"));
		Referees.add(new Referees("Referees", 4, "Trevor", 35, "SA"));
		Referees.add(new Referees("Referees", 5, "Andraw", 38, "TS"));
	}
}
	
