package com.shivam.springdemo;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Spend 30mins on batting practice";
	}
}
