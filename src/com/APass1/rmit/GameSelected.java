package com.APass1.rmit;

import java.util.Random;
import java.util.Scanner;

import com.APass1.rmit2.GetReferees;

public class GameSelected {
	AthletesGet athletesGet = new AthletesGet();
	GetReferees getReferees = new GetReferees();
	private boolean error;
	int secondChoice = 0;
	Scanner sc = new Scanner(System.in);
	public static final String[] games = new String[]{"swimming","cycling","running"};
	public String[] getGames(){
		return games;
	}
	
	protected int displayAllGames(){
		displaySecondMenu();
		checkSecondMenuInput();
		selectGame();
		return secondChoice-1;
	}
	
	public void getAthletes(int secondChoice){
		
	}
	
	public void displaySecondMenu(){
		System.out.println("Please select a game to run");
		System.out.println("======================================");
		System.out.println("1. Swimming");
		System.out.println("2. Cycling");
		System.out.println("3. Running");
		System.out.println("4. Exit");
		System.out.print("Please enter an option:\b\b");
	}
	
	protected void checkSecondMenuInput(){  
		//Check user's input if it is integer between 1 and 4.
		
			try{
				secondChoice = sc.nextInt();
				if(secondChoice > 0 && secondChoice <= 4){//only 4 opinions
					error = false;
				}else{
					System.out.println("Your input is invalid. Please input an integer between 1 to 4.");
					displaySecondMenu();
					sc.next();
					error = true;
				}
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Your input is invalid. Please input an integer between 1 to 4.");
				displaySecondMenu();
				sc.next();
				error = true;
			}
			while(error);
			
	}
	protected void selectGame(){
		switch (secondChoice){
		case 1:
			System.out.println("You've selected swimming game");
			athletesGet.randomParticipants(0,23);
			getReferees.randomReferee();
			break;
		case 2:
			System.out.println("You've selected cycling game");
			athletesGet.randomParticipants(7,23);
			getReferees.randomReferee();
			break;
		case 3:
			System.out.println("You've selected running game");
			athletesGet.randomParticipants(14,16);
			getReferees.randomReferee();
			break;
		case 4:
			System.exit(0);
			break;
		}
	}
}
