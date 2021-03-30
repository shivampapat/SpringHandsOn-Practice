package com.shivam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//Step 1- Created Xml file for configuring bean
		
		//Step 2- Load Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Step 3- Retrieve bean from container
		//mycoach is ID of bean and it is an object of a class who implemented Coach , thus Coach.class
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach2", Coach.class);
		
		//Use the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach2.getDailyWorkout());
		
		//Calling new fortune methods
		System.out.println(coach.getDailyFortune());
		System.out.println(coach2.getDailyFortune());
		
		
		
		//Close the context
		context.close();
	}

}
