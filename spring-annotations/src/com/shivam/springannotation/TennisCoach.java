package com.shivam.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Step1.2 Default Bean ID (class name with first character lowercase)
@Component
public class TennisCoach implements Coach {

	//Field Injection
	@Autowired
	private FortuneService fortuneService;
	
	/*
	//Create COnstructor for injection
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	//default constructor
	public TennisCoach() {
		System.out.println("Inside default constructor of tennis coach");
	}
	
	/*
	//Create setter method for injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside setter function of tennis coach");
	}
	
	*/
	
	/*
	 * //Create any method of xyz name for injection
	@Autowired
	public void anyMethod(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside any function  of tennis coach");
	}
	
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
