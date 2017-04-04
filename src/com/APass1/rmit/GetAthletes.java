package com.APass1.rmit;
import java.util.*;

public class GetAthletes {
	static int ParticipantNumber;
	static ArrayList ParticipantAthletes = new ArrayList();
	static int i = 0;
	static boolean gameSelected = false;
	public void setParticipantAthletes(){
		ParticipantAthletes.clear();
	}
	public ArrayList getList(){
		return ParticipantAthletes;
		
	}
	static Random rd = new Random();

	public void randomParticipants(int x, int y){ //use x and y to get right athlete ID.
		gameSelected = true;
		ParticipantNumber = 4 + rd.nextInt(5); 
		for (int i = 0; i < ParticipantNumber; i++){//select participants randomly.
			ParticipantAthletes.add((int)(y * Math.random() + x));	
			for(int j = 0; j < i; j++){//if athlete repeated, random creat again
				int a =(int)ParticipantAthletes.get(i);
				int b =(int)ParticipantAthletes.get(j);
				while (a==b){
					i--;
				}
			
			}
		}
		displayRandomParticipants();
	}
	public void displayRandomParticipants(){
		System.out.println("Participant athletes' IDs are :");
		for(int j = 0; j < ParticipantNumber; j++){
			System.out.print(ParticipantAthletes.get(j)+"  ");
			System.out.println();
			}
	}
}
