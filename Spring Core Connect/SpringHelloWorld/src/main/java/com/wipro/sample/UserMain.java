package com.wipro.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
*/

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Resource resource = new FileSystemResource("src/main/resources/beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		HelloWorld helloWorld = beanFactory.getBean(HelloWorld.class);
		*/
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.display();
	}

}
