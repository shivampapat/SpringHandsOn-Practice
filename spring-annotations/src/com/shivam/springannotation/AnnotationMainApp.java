package com.shivam.springannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMainApp {

	public static void main(String[] args) {

		//Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean
		Coach coach = context.getBean("tennisCoach",Coach.class);
		Coach coach2 = context.getBean("tennisCoach",Coach.class);
		
		//Use the bean
		System.out.println(coach.getDailyWorkout());
		
		System.out.println();
		
		//Beans are singleton 
		System.out.println(coach.hashCode());
		System.out.println(coach2.hashCode());
		
		//Close the container context
		context.close();
	}

}
