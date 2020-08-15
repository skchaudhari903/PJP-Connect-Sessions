package com.wipro.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.bean.Employee;

public class UserMainAutowireByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-autowire-byName.xml");
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
	}

}
