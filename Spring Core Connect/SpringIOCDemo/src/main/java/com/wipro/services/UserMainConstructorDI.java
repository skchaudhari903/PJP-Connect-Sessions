package com.wipro.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.bean.Employee;

public class UserMainConstructorDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-consdi.xml");
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
	}

}
