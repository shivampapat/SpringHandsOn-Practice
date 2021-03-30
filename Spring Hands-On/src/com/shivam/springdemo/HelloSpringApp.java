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
		Coach coach3 = context.getBean("myCoach3", Coach.class);
		
		//(as email add and team is not in coach interface)
		CodingCoach coach4 = context.getBean("myCoach4", CodingCoach.class);
		
		System.out.println();
		//Use the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach2.getDailyWorkout());
		System.out.println(coach3.getDailyWorkout());
		System.out.println(coach4.getDailyWorkout());
		
		System.out.println();
		//Calling new fortune methods
		System.out.println(coach.getDailyFortune());
		System.out.println(coach2.getDailyFortune());
		System.out.println(coach3.getDailyFortune());
		System.out.println(coach4.getDailyFortune());
		
		System.out.println();
		//Methods of Coding class 
		System.out.println("Email address is " +coach4.getEmailAddress());
		System.out.println("Team name is "+ coach4.getTeamName());
		
		//Close the context
		context.close();
	}

}
