package com.shivam.springdemo;

public class BaseballCoach implements Coach{

	//DI
	private FortuneService fortuneService;
	
	//Constructor for FortuneService (Dependency injection)
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Constructor injection used in baseball");
	}
	
	//Constructor wo arguments 
	public BaseballCoach() {
		System.out.println("I am Baseball Coach");
	}

	
	@Override
	public String getDailyWorkout() {
		return "Spend 30mins on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		
		//Use the object to get fortune() from happy fortune
		return "Baseball coach says : " + fortuneService.getFortune();
	}
}
