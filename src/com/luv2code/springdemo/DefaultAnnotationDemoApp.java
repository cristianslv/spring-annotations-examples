package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefaultAnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("defaultComponent-applicationContext.xml");
		
		//get bean from spring container
		Coach theCoach = context.getBean("soccerCoach", Coach.class);
		
		// call a method on the bean 
		System.out.print(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
