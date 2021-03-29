package com.shivam.springdemo;

public class CodingCoach implements Coach {

	//DI
	private FortuneService fortuneService;
	
	//Constructor for FortuneService (Dependency injection)
	public CodingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	//Constructor wo arguments 
	public CodingCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Solve 5 questions from LeetCode";
	}
	
	@Override
	public String getDailyFortune() {
		
		//Use the object to get fortune() from happy fortune
		return "Coding coach says : "+ fortuneService.getFortune();
	}
}
