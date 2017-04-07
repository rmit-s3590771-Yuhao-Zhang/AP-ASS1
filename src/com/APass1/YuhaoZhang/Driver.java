package com.APass1.YuhaoZhang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.APass1.YuhaoZhang.GamePredicted;

public class Driver {
	private static boolean isPredictGame = false;//record whether the game has been predicted.
	private static boolean isStartGame = false; // record whether the game has been started.
	private static int GAME_ID = 0;//record the game user have selected.
	private static int ATHLETE_ID = 0;//record the athlete user have selected.
	AthletesGet athletesGet = new AthletesGet();
	Scanner sc = new Scanner(System.in);
	private int choice = 0;
	private boolean error = true;
	
	public int getGameID(){
		return GAME_ID;
	}
	
	GameSelected gameSelected = new GameSelected();
	/**
	 * display menu
	 */
	public void runGame(){
		displaymenu();
		checkMeanMenuInput();
		runMenu();
	}
	protected static void displaymenu(){
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
				if(choice > 0 && choice <= 6){//only 6 opinions
					error = false;
				}else{
					System.out.println("Your input is invalid. Please input an integer between 1 to 6.");
					displaymenu();
					error = true;
				}
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Your input is invalid. Please input an integer between 1 to 6.");
				displaymenu();
				sc.next();
				error = true;
			}
			while(error);
	
	}
	protected void runMenu(){
		switch(choice){
		case 1:
			gameSelected();
			runGame();
			break;
		case 2:
			gamePredicted();
			runGame();
			break;
		case 3:
			gameStart();
			runGame();
			break;
		case 4:
			gameResult();
			runGame();
			break;
		case 5:
			athletePoints();
			runGame();
			break;
		case 6: 
			System.exit(0);
			break;
		}
	}
	
	protected void gameSelected(){
		/*get ID of the game that user selected
		 * 
		 */
		if(athletesGet.isSelectGame()){
			System.out.println("You have selected a game.");
		}else {
			GAME_ID=gameSelected.displayAllGames();
		}
	}
	/*
	 * Get id of the athlete that user predict who is winner
	 */
	protected void gamePredicted(){
		if(athletesGet.isSelectGame()){
			GamePredicted gamePredicted = new GamePredicted();
			ATHLETE_ID = gamePredicted.displayAllAthletes(GAME_ID);
			isPredictGame = true;
		}else {
			System.out.println("Firstly, you need to select a game to run.");
			runGame();
		}
	}
//	public int compete(){
//		int seconds = 0;
//		Random rd = new Random();
//		if (secondChoice==1){
//		seconds = rd.nextInt(101)+100;
//		}else if(secondChoice == 2){
//		seconds = rd.nextInt(301)+800;
//		}else if(secondChoice == 3){
//		seconds = rd.nextInt(11)+10;
//		}
//		return seconds;
//	}
	/*
	 * Start a game
	 */
	protected void gameStart(){
		if(athletesGet.isSelectGame()){
			GameStart gameStart = new GameStart();
			gameStart.start(GAME_ID, ATHLETE_ID);
			isStartGame = true;
			athletesGet.setIsSelectGame(false);
			ATHLETE_ID=0;
		}else {
			System.out.println("Firstly, you need to select a game to run.");
			runGame();
		}
	}
	public int getAthleteID(){
		return ATHLETE_ID;
	}
	/*
	 * Display result of games
	 */
	protected void gameResult(){
		if(isStartGame){
			GameStart gameStart = new GameStart();
			List<String> results;
			results = gameStart.getResults();
			for (int i = 0; i < results.size(); i++) {
				System.out.println(results.get(i));
			}
		}else{
			System.out.println("Please select a game to start firstly.");
			runGame();
		}
	}

	protected void athletePoints(){
		System.out.println("Athlete Point\n");
		Athlete athletes[] = AthletesInit.getAthletes();
		System.out.println("ID\tname\tage\tstate\tpoints\t");
		for(int i = 0 ; i < 31; i++){
			System.out.println(athletes[i].getAthleteID()+"\t"+athletes[i].getName()+"\t"+
                    athletes[i].getAge()+"\t"+athletes[i].getState()+"\t"+athletes[i].getPoint());
	        
		}
		runGame();
			
	}

}
