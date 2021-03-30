package com.shivam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMainApp {

	public static void main(String[] args) {

		//Step 1- Created Xml file for configuring bean
		
		//Step 2- Load Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		
		//Step 3- Retrieve bean from container
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);
		
		System.out.println();
		
		Coach coach3 = context.getBean("myCoach2",Coach.class);
		Coach coach4 = context.getBean("myCoach2",Coach.class);
		
		System.out.println();
		
		if(coach == coach2) {
			System.out.println("Both has same references");
			System.out.println("Coach 1 has  " + coach.hashCode());
			System.out.println("Coach 2 has  " + coach2.hashCode());
		}
		else {
			System.out.println("They have different reference");
			System.out.println("Coach 1 has  " + coach.hashCode());
			System.out.println("Coach 2 has  " + coach2.hashCode());
		}
		System.out.println();
		

		if(coach3 == coach4) {
			System.out.println("Both has same references");
			System.out.println("Coach 3 has  " + coach3.hashCode());
			System.out.println("Coach 4 has  " + coach4.hashCode());
		}
		else {
			System.out.println("They have different reference");
			System.out.println("Coach 3 has  " + coach3.hashCode());
			System.out.println("Coach 4 has  " + coach4.hashCode());
		}
		
		//Close the context
		context.close();
	}

}
