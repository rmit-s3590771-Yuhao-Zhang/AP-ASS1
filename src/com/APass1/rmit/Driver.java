package com.APass1.rmit;

import java.util.Scanner;

public class Driver {
	private int input;
	private boolean error;
	private Scanner sc = new Scanner(System.in);
	
	public void runGame(){
		menu();
		checkInput();
	}
	private void menu(){
		//Create menu for game.
		System.out.println("Ozlypic Game");
		System.out.println("======================================");
		System.out.println("1. Select a game to run");
		System.out.println("2. Predict the winner of the game");
		System.out.println("3. Start the game");
		System.out.println("4. Display the final result of results of all gomes");
		System.out.println("5. Display the point of all athletes");
		System.out.println("6. Exit");
	}
	private void checkInput(){
		//Check user's input if it is integer between 1 and 6.
		do{
			try{
				int choice = sc.nextInt();
				input = choice;
				if(input > 0 && input <= 6){
					error = false;
				}else{
					menu();
					System.out.println("Your input is invalid. Please input an integer between 1 to 5.");
					error = true;
				}
			}
			catch(java.util.InputMismatchException e){
				menu();
				System.out.println("Your input is invalid. Please input an integer between 1 to 5.");
				sc.next();
				error = true;
			}
		}while(error);
	}
	
}
