package com.learning.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien = (Alien) context.getBean("alien");
        alien.code();
       // alien.age = 15;
        System.out.println(alien.getAge());
        
		/*
		 * Alien alien1 = (Alien) context.getBean("alien"); alien1.code(); //alien1.age
		 * = 15; System.out.println(alien1.age);
		 */

    }
}
