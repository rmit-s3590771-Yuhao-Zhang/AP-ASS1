package com.APass1.rmit;

import java.util.ArrayList;
import java.util.List;

public class game extends Participant{
	ArrayList<Athlete> result = new ArrayList<>();
	ArrayList<Integer> scoreList = new ArrayList<>();

	
	public game(int ID, String name, int age, String state){
		super(ID, name, age, state); 
	}
//	public void addScore(Athlete athlete, int score){
//		for (int i = 0; i < scoreList.size(); i++) {
//			if(scoreList.get(i)>score){
//				continue;
//			}else{
//				result.add(i, athlete);
//				scoreList.add(i, score);
//				break;
//			}
//		}
//		if(!result.contains(athlete)){
//			result.add(athlete);
//			scoreList.add(score);
//		}
//	}
	public void summarise(){
		for (int rank = 1; rank <=3; rank++){
			Athlete athlete = result.get(rank);
			switch(rank){
			case 1:
				athlete.addPoint(5);
				break;
			case 2:
				athlete.addPoint(2);
				break;
			case 3:
				athlete.addPoint(1);
				break;
			default:
				break;
			}
		}
	}
	public List<Athlete> getResult(){
		return result;
	}
	
}
