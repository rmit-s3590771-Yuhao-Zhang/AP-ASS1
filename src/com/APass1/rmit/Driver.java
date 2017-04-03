package com.APass1.rmit;

import java.util.Scanner;

public class Driver {
	private int input;
	private int secondInput;
	private boolean error;
	private Scanner sc = new Scanner(System.in);
	
	public void runGame(){
		menu();
		checkMeanMenuInput();
		runMenu();
		
	}
	protected void menu(){
		//Create menu for game.
		System.out.println("Ozlypic Game");
		System.out.println("======================================");
		System.out.println("1. Select a game to run");
		System.out.println("2. Predict the winner of the game");
		System.out.println("3. Start the game");
		System.out.println("4. Display the final result of results of all games");
		System.out.println("5. Display the point of all athletes");
		System.out.println("6. Exit");
		System.out.print("Please enter an option:\b\b");
	}
	protected void checkMeanMenuInput(){  
		//Check user's input if it is integer between 1 and 6.
		
			try{
				int choice = sc.nextInt();
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
	public void checkSecondMenuInput(){  
		//Check user's input if it is integer between 1 and 4.
		
			try{
				int secondChoice = sc.nextInt();
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
		switch(secondInput){
		case 1:
			System.out.println("You've selected swimming game");
			GetAthletes.randomParticpants();
			GetAthletes.displayParticpant();
			GetReferees.randomReferees();
			GetReferees.displayReferees();
		case 2:
			System.out.println("You've selected cycling game");
			GetAthletes.randomParticpants();
			GetAthletes.displayParticpant();
			GetReferees.randomReferees();
			GetReferees.displayReferees();
		case 3:
			System.out.println("You've selected cycling game");
			GetAthletes.randomParticpants();
			GetAthletes.displayParticpant();
			GetReferees.randomReferees();
			GetReferees.displayReferees();
		case 4:
			System.exit(0);
			break;
		}
	}
	protected void predictGame(){
		
	}
	protected void startGame(){
		
	}
	protected void getResult(){
		
	}
	protected void getPoint(){
		
	}
}
