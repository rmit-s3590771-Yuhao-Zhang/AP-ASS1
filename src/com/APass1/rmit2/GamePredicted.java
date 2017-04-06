package com.APass1.rmit2;

import java.util.Scanner;

import com.APass1.rmit.AthletesGet;

public class GamePredicted {
	static boolean isAdd = true;
	AthletesGet athletesGet = new AthletesGet();
	public int displayAllAthletes(int GAME_ID){
		Scanner input = new Scanner(System.in);
		int select = 0;
		if(isAdd){
			isAdd = false;
		}
		switch (GAME_ID){
		case 0:
			athletesGet.displayRandomParticipants();
			select = input.nextInt();
			break;
		case 1:
			athletesGet.displayRandomParticipants();
			select = input.nextInt();
			break;
		case 2:
			athletesGet.displayRandomParticipants();
			select = input.nextInt();
			break;
		default:
			break;
		}
		return select;
	}
	
}
