package com.APass1.rmit;

public class Ozlympic {

	public static void main(String[] args) {
		GetAthletes getAthletes = new GetAthletes();
		Athlete.AddAthlete();//add all athlete to tarraylist.
		Referees.AddReferees();//add all referees to arraylist.
		Driver myDriver = new Driver();
		myDriver.runGame();

	}

}
