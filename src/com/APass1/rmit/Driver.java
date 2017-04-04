package com.APass1.rmit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Driver {
	private int type;
	private int athleteTime;
	private int input;
	private int secondInput;
	private boolean error;
	private int choice,secondChoice = 0;
	private Scanner sc = new Scanner(System.in);
	GetAthletes GA = new GetAthletes();
	GetReferees GR = new GetReferees();
	private int winnerPrediction;
	ArrayList<Athlete> time = new ArrayList<>();
	private List<Athlete> athletes;
	private List<Athlete> result;
	private game Game;
	
	
	public void runGame(){
		menu();
		checkMeanMenuInput();
		runMenu();
		
	}
	protected static void menu(){
		//Create menu for game.
		System.out.println("Ozlympic Game");
		System.out.println("======================================");
		System.out.println("1. Select a game to run");
		System.out.println("2. Predict the winner of the game");
		System.out.println("3. Start the game");
		System.out.println("4. Display the final result of results of all games");
		System.out.println("5. Display the point of all athletes");
		System.out.println("6. Exit");
		System.out.print("Please enter an option:");
	}
	protected void checkMeanMenuInput(){  
		//Check user's input if it is integer between 1 and 6.
		
			try{
				choice = sc.nextInt();
				input = choice;
				if(input > 0 && input <= 6){//only 6 opinions
					error = false;
				}else{
					System.out.println("Your input is invalid. Please input an integer between 1 to 6.");
					menu();
					error = true;
				}
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Your input is invalid. Please input an integer between 1 to 6.");
				menu();
				sc.next();
				error = true;
			}
			while(error);
	
	}
	protected void runMenu(){
		switch(input){
		case 1:
			displaySecondMenu();
			checkSecondMenuInput();
			selectGame();
			break;
		case 2:
			predictGame();
			break;
		case 3:
			startGame();
			break;
		case 4:
			getResult();
			break;
		case 5:
			getPoint();
			break;
		case 6: 
			System.exit(0);
			break;
		
				
			
		}
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
				secondInput = secondChoice;
				if(secondInput > 0 && secondInput <= 4){//only 4 opinions
					error = false;
				}else{
					System.out.println("Your input is invalid. Please input an integer between 1 to 4.");
					displaySecondMenu();
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
		if (secondChoice == 1){
			System.out.println("You've selected swimming game");
			GA.randomParticipants(0,23);
			GR.randomReferee();
			}
		if (secondChoice == 2){
			System.out.println("You've selected cycling game");
			GA.randomParticipants(7,23);
			GR.randomReferee();
		}
		if (secondChoice == 3){
			System.out.println("You've selected running game");
			GA.randomParticipants(14,16);
			GR.randomReferee();
		}
		if (secondChoice == 4){
			System.exit(0);
		}
		runGame();
	}
	
	protected void predictGame(){
		System.out.println("Please predict the winner of the game you choose(please input athlete's ID)");
		winnerPrediction = sc.nextInt();
		runGame();
	}
	public int compete(){
		int seconds = 0;
		Random rd = new Random();
		if (secondChoice==1){
		seconds = rd.nextInt(101)+100;
		}else if(secondChoice == 2){
		seconds = rd.nextInt(301)+800;
		}else if(secondChoice == 3){
		seconds = rd.nextInt(11)+10;
		}
		return seconds;
	}
	protected void startGame(){
		
		Game.summarise();
		result = Game.getResult();
		
	}
	public List<Participant> getPrintResult(){
		List<Participant> pList = new ArrayList<Participant>();
		pList.add(Game);
		pList.add(result.get(0));
		pList.add(result.get(1));
		pList.add(result.get(2));
		return pList;
	}

	public int getType() {
		return type;
	}
	public game getGame() {
		return Game;
	}
	public List<Athlete> getAthlete(){
		return athletes;
	}
	public List<Athlete> getResult(){
		return result;
	}
	public void setGame(game game) {
		Game = game;
	}
	protected void getResults(){
		for (int i = 0; i < result.size(); i++) {
			System.out.println(Game.result.get(i));
			
		}
	}
	protected void getPoint(){
		
	}

}
