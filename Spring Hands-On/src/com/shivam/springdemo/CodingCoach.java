package com.shivam.springdemo;

public class CodingCoach implements Coach {

	//DI
	private FortuneService fortuneService;
	
	
	//Constructor without arguments 
	public CodingCoach() {
		System.out.println("I am Coding Coach");
	}
	
	//Constructor for FortuneService (Dependency injection)
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Setter injection used in coding");
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
