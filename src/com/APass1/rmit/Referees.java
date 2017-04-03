package com.APass1.rmit;

import java.util.ArrayList;

class Referees extends Participant{
	public Referees(String ID, String name, int age, String state){
		super(ID, name, age, state);
	}
	static ArrayList<Referees> Referees = new ArrayList<Referees>();
	
	public static void AddReferees(){//insert referees
		Referees.add(new Referees("Referees0001", "Elizabeth", 35, "VIC"));
		Referees.add(new Referees("Referees0002", "Michael", 39, "NSW"));
		Referees.add(new Referees("Referees0003", "Tom", 43, "QL"));
		Referees.add(new Referees("Referees0004", "Trevor", 35, "SA"));
		Referees.add(new Referees("Referees0005", "Andraw", 38, "TS"));
	}
}
	
