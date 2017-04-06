package com.APass1.SamadikunSuryaKongoasa;
import java.util.*;

public class AthletesGet {
	static List<String> aList;
	static ArrayList list = new ArrayList();
	static ArrayList rlist = new ArrayList();
	static int number;
	static int i = 0;
	static boolean gameSelected = false;
	private static boolean isSelectGame = false; //record whether the game has been select
	Random random = new Random();
	
	public boolean isSelectGame(){
		return isSelectGame;
	}
	
	public void setIsSelectGame(boolean isSelectGame){
		AthletesGet.isSelectGame = isSelectGame;
	}
	
	public ArrayList getList(){
		return list;
	}
	
	public void setList(){
		list.clear();
	}
	
	public List<String> getaList(){
		return aList;
	}  
	
	public void getData(){
		aList = AthletesInit.getData();
	}
	
	public void randomParticipants(int x, int y){ //use x and y to get right athlete ID.
		number = 3 + random.nextInt(6); //Generated number of participants randomly,
		int isTrue = 1;
		if(number<4){
			isTrue = 0;
		}
		switch (isTrue){
		case 1:
			isSelectGame = true;
		for (int i = 0; i < number; i++){//select participants randomly.
			list.add((int)(y * Math.random() + x));	
			for(int j = 0; j < i; j++){//if athlete repeated, random creat again
				int a =(int)list.get(i);
				int b =(int)list.get(j);
				while (a==b){
					i--;
				}
			
			}
		}
		break;
		case 0:
			System.out.println("The game has been cancelled since there are less than 4 participants.");
			break;
		default:
			break;
		}
	}
	public void displayRandomParticipants(){
		for(int j = 0; j < number; j++){
			Object object = list.get(j);
			int i = (int)object;
			System.out.println(aList.get(i));
		}
		System.out.println("Enter an id:");
	}
}
