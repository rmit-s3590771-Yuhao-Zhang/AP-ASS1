package com.APass1.SamadikunSuryaKongoasa;

import java.util.ArrayList;
import java.util.List;

public class AthletesInit {
		static Athlete athletes[] = new Athlete[31];
		public static Athlete[] getAthletes(){
			return athletes;
		}
		public static List<String> listInit(List<String> list){
			for (int i = 0; i < athletes.length; i++) {
				list.add(athletes[i].getAthleteID()+"\t" + athletes[i].getName()+"\t"+athletes[i].getAge()+"\t"+ athletes[i].getState());
			}
			return list;
		}
		public static List<String> getData(){
			List<String> list = new ArrayList<>();
			athletes[0] =(new Athlete( 0, "Matt", 17, "QL")) ;
			athletes[1] = new Athlete( 1, "Ivy", 18, "TS");
			athletes[2] = new Athlete( 2, "Tony", 22, "VIC");
			athletes[3] = new Athlete( 3, "Jack", 21, "SA");
			athletes[4] = new Athlete( 4, "Mark",  24, "NSW");
			athletes[5] = new Athlete( 5, "James", 29, "VIC");
			athletes[6] = new Athlete( 6, "Lily",  22, "VIC");
			athletes[7] = new Athlete( 7, "Rachel",  22, "QL");
			athletes[8] = new Athlete( 8, "Thomas", 18, "TS");
			athletes[9] = new Athlete( 9, "Daniel", 25,"VIC");
			athletes[10] = new Athlete( 10, "Paul", 26,"SA");
			athletes[11] = new Athlete( 11, "Amy", 18, "NSW");
			athletes[12] = new Athlete( 12, "Sarah", 25,"VIC");
			athletes[13] = new Athlete( 13, "Jennifer", 26,"VIC");
			athletes[14] = new Athlete( 14, "Linda", 23,"QL");
			athletes[15] = new Athlete( 15, "Candy", 24,"VIC");
			athletes[16] = new Athlete( 16, "Eric", 18,"NSW");
			athletes[17] = new Athlete( 17, "Jason", 20,"TS");
			athletes[18] = new Athlete( 18, "William", 22,"NSW");
			athletes[19] = new Athlete( 19, "Angela", 24,"SA");
			athletes[20] = new Athlete( 20, "Jenny", 19,"VIC");
			athletes[21] = new Athlete( 21, "Jessica", 20,"SA");
			athletes[22] = new Athlete( 22, "Chris", 27,"VIC");
			athletes[23] = new Athlete( 23, "Emily", 26,"VIC");
			athletes[24] = new Athlete( 24,"Sunny", 21,"QL");
			athletes[25] = new Athlete( 25,"David", 17,"NSW");
			athletes[26] = new Athlete( 26,"Jessica", 19,"TS");
			athletes[27] = new Athlete( 27,"Lisa", 24,"VIC");
			athletes[28] = new Athlete( 28,"George", 27,"NSW");
			athletes[29] = new Athlete( 29,"Kevin", 19,"VIC");
			athletes[30] = new Athlete( 30,"Eva", 17,"VIC");
			/*
			 * 0-6 swimmer
			 * 7-13 sprinter
			 * 14-23 super athlete
			 * 24-30 cyclist
			 */
		
			list = listInit(list);
			return list;
		}
}
