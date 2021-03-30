package com.shivam.springdemo;

public class TrackCoach implements Coach {

	//DI
	private FortuneService fortuneService;
	
	//Constructor for FortuneService (Dependency injection)
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Constructor injection used in tracking");
	}
	
	//Constructor wo arguments 
	public TrackCoach() {
		System.out.println("I am Track Coach");
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
	
	//Init and Destroy method
	public void StartingStuff() {
		System.out.println("Inside init method of trackCoach");
	}
	
	public void CleaningStuff() {
		System.out.println("Inside destroy method of trackCoach");
	}
}
