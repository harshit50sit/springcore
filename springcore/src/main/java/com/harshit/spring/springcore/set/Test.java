package com.harshit.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Create the test class

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/harshit/spring/springcore/set/setconfig.xml");
		CarDealer car = (CarDealer) context.getBean("cardealer");
		System.out.println(car.getName());
		System.out.println(car.getModels());
		//System.out.println(car.getModels().getClass());
	}

}
