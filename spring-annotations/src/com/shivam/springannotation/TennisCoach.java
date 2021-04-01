package com.shivam.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Step1.2 Default Bean ID (class name with first character lowercase)
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	//Create COnstructor for injection
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
