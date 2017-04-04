package com.APass1.rmit;

import java.util.ArrayList;

class Referees extends Participant{
	public Referees(int ID, String name, int age, String state){
		super(ID, name, age, state);
	}
	static ArrayList<Referees> Referees = new ArrayList<Referees>();
	
	public static void AddReferees(){//insert referees
		Referees.add(new Referees(1, "Elizabeth", 35, "VIC"));
		Referees.add(new Referees(2, "Michael", 39, "NSW"));
		Referees.add(new Referees(3, "Tom", 43, "QL"));
		Referees.add(new Referees(4, "Trevor", 35, "SA"));
		Referees.add(new Referees(5, "Andraw", 38, "TS"));
	}
}
	
