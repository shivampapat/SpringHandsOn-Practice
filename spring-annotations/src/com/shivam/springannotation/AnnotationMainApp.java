package com.shivam.springannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMainApp {

	public static void main(String[] args) {

		//Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean
		Coach coach = context.getBean("myCoach",Coach.class);
		
		//Use the bean
		System.out.println(coach.getDailyWorkout());
		
		//Close the container context
		context.close();
	}

}
