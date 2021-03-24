package com.shivam.springdemo;

public class MyApp {

	public static void main(String[] args) {

		//Create object
		Coach bobj = new BaseballCoach();
		
		//Get workout
		System.out.println(bobj.getDailyWorkout());
	}

}
