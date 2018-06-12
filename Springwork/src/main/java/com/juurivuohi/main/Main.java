package com.juurivuohi.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/juurivuohi/beans/Beans.xml");
		context.getBean("customer");
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
