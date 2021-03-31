package com.shivam.springannotation;

import org.springframework.stereotype.Component;

//Step1.2 Default Bean ID (class name with first character lowercase)
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
