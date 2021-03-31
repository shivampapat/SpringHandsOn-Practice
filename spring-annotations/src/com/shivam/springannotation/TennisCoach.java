package com.shivam.springannotation;

import org.springframework.stereotype.Component;

//Step1.2 (Registering component in Java class)
@Component("myCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
