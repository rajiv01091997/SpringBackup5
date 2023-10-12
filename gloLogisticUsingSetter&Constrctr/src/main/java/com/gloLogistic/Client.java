package com.gloLogistic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		System.out.println("IOC created: " +context);
		
		
		Freight freight_one = (Freight) context.getBean("Freight1");
        Freight freight_two = (Freight) context.getBean("Freight2");

        
        System.out.println("freight is created"+freight_one);
        System.out.println("freight is created"+freight_two);

         ((AbstractApplicationContext)context).close();
	}

}
