package com.shivam.springannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {

		//Load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean
		Coach coach = context.getBean("tennisCoach",Coach.class);
		Coach coach2 = context.getBean("tennisCoach",Coach.class);
				
		//Use the bean
		boolean isSame = (coach ==coach2);
		
		System.out.println("\nPointing to same object " + isSame);
		System.out.println();
		
		System.out.println("Coach " + coach.hashCode());
		System.out.println("Coach2 " + coach2.hashCode());
		
		//Close the context
		context.close();
	}

}
