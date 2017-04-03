package com.APass1.rmit;
import java.util.*;

public class GetAthletes {
	Random rd = new Random();
	private static boolean SuccessfulSelected = false; //to record if game has been selected.
	static int ParticpantNumber;
	
	public void randomParticpants(){
		int IsTrue = 1;
		ParticpantNumber =rd.nextInt(9);
		if (ParticpantNumber < 5){
			IsTrue = 0;
		}
		switch(IsTrue){
		case 1:
			SuccessfulSelected = true;  //game start successfully.
			//select particpants from list
			// not finish here
		
		case 0:
			System.out.println("The game didn't start because the particapant number is below 5.");
			break;
		default:
			break;
		}
		
		
	}
	
	public void displayParticpant(){
		//diaplay particpant info.
	}
}
