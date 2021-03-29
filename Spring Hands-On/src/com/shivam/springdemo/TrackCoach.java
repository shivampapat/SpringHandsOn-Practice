package com.shivam.springdemo;

public class TrackCoach implements Coach {

	//DI
	private FortuneService fortuneService;
	
	//Constructor for FortuneService (Dependency injection)
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	//Constructor wo arguments 
	public TrackCoach() {
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Run for 5 kilometers";
	}
	
	@Override
	public String getDailyFortune() {
		
		//Use the object to get fortune() from happy fortune
		return "Track coach says : "+ fortuneService.getFortune();
	}
}
