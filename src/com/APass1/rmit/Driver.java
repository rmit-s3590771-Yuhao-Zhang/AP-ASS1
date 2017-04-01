package com.APass1.rmit;

import java.util.Scanner;

public class Driver {
	private int input;
	private boolean error;
	private boolean running;
	private Scanner sc = new Scanner(System.in);
	
	public void runGame(){
		running = true;
		
		while(running){
		menu();
		checkInputMenu(6);
		runMenu();
		}
		
	}
	private void menu(){
		//Create menu for game.
		System.out.println("Ozlypic Game");
		System.out.println("======================================");
		System.out.println("1. Select a game to run");
		System.out.println("2. Predict the winner of the game");
		System.out.println("3. Start the game");
		System.out.println("4. Display the final result of results of all games");
		System.out.println("5. Display the point of all athletes");
		System.out.println("6. Exit");
		System.out.println("\nEnter an option : ");
		
	}
	
	private void checkInputMenu(int max){  
		//Check user's input if it is integer between 1 and max.
		
			try{
				int choice = sc.nextInt();
				input = choice;
				if(input > 0 && input <= max){
					error = false;
				}else{
					System.out.println("Your input is invalid. Please input an integer between 1 to " + max + ".");
					error = true;
				}
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Your input is invalid. Please input an integer between 1 to " + max + ".");
				sc.next();
				error = true;
			}
	}
	


	private void runMenu(){
		switch(input){
		case 1:
			
		case 2:
			
		case 3:
			
		case 4:
			
		case 5:
			
		case 6: //Exit the program
			running = false;
			}
		return;
	}
	
}
	


