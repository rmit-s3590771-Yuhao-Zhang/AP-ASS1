package com.APass1.rmit2;

import com.APass1.rmit.AthletesGet;
import com.APass1.rmit.Driver;

public class Ozlympic {

	public static void main(String[] args) {
		AthletesGet athletesGet = new AthletesGet();
		GetReferees getReferees = new GetReferees();
		athletesGet.getData();
		Driver driver = new Driver();
		driver.runGame();
	}
}
