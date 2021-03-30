package com.shivam.springdemo;

public class CodingCoach implements Coach {

	//Characteristics of CodingClass
	//Created for injecting literal values to a class
	private String emailAddress;
	private String teamName;
	
	//Setters and Getters

	public void setEmailAddress(String emailAddress) {
		System.out.println("CodingCoach : Inside setEmailAddress");
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setTeamName(String teamName) {
		System.out.println("CodingCoach : Inside setTeamName");
		this.teamName = teamName;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	
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
