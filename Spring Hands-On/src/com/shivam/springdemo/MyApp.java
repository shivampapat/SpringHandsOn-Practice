package com.shivam.springdemo;

public class MyApp {

	public static void main(String[] args) {

		//Create object
		Coach bobj = new BaseballCoach();
		Coach tobj = new TrackCoach();
		Coach cobj = new CodingCoach();
		
		//Get workout
		System.out.println("For baseball "+bobj.getDailyWorkout());
		System.out.println("For running  "+tobj.getDailyWorkout());
		System.out.println("For coding   "+cobj.getDailyWorkout());
	}

}
