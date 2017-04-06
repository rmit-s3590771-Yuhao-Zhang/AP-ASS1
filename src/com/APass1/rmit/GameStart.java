package com.APass1.rmit;

import java.util.ArrayList;
import java.util.List;

import com.APass1.rmit2.GetReferees;

public class GameStart {
	static List<String> results = new ArrayList<>();
	static ArrayList list = new ArrayList();
	AthletesGet athletesGet = new AthletesGet();
	GetReferees getReferees = new GetReferees();
	
	public List<String> getResults(){
		return results;
	}
	
	/**
	 * Start a game
	 */
	public void start(int GAME_ID, int ATHLETE_ID){
		Athlete athletes[] = AthletesInit.getAthletes();
		int i, j, temp;
		list = athletesGet.getList();
		int[]time = new int[list.size()];
		GameSelected gameSelected = new GameSelected();
		String games[]=gameSelected.getGames();
		results.add("\nThe result of" + games[GAME_ID]);
		results.add("======================================");
		results.add("id\tname\tage\tstate\ttimes\t");
		for ( i = 0; i< list.size(); i++){
			athletes[(int) list.get(i)].compete(GAME_ID);
			time[i] = athletes[(int) list.get(i)].getTime();
			results.add(athletes[(int) list.get(i)].getAthleteID()+"\t"+athletes[(int) list.get(i)].getName()+"\t"+
                    athletes[(int) list.get(i)].getAge()+"\t"+athletes[i].getState()+"\t"+
                    athletes[(int) list.get(i)].getPoint()+athletes[(int) list.get(i)].getTime());
		}
		for (i = 0; i < list.size(); i++) {
			for (j = 0; j < list.size(); j++) 
				if(time[i]>time[j]){
					temp = time[i];
					time[i] = time [j];
					time[j] = temp;
				}
			}
		for (i = 0; i < list.size(); i++) {
			if(athletes[(int) list.get(i)].getTime() == time[0]){
			   athletes[(int) list.get(i)].setPoints(5);
			   if (ATHLETE_ID == athletes[(int) (list.get(i))].getAthleteID()){
				   System.out.println("Congratulations! Your prediction is correct!");
			   }
			}else if (athletes[(int)list .get(i)].getTime() == time[1]){
				athletes[(int)list.get(i)].setPoints(2);
			}else if  (athletes[(int)list .get(i)].getTime() == time[2]){
				athletes[(int)list.get(i)].setPoints(1);
			}
		}
		athletesGet.setList();
	}
}
