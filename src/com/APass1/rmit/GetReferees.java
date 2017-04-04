package com.APass1.rmit;

import java.util.Random;

public class GetReferees {
	Random rd = new Random();
	int RefereeID;
	public void randomReferee(){
		RefereeID = rd.nextInt(5)+1;
		displayRandomReferee();
	}
	public void displayRandomReferee(){
		System.out.println("Participant referee's ID is : ");
		System.out.println(RefereeID);
	}
}

