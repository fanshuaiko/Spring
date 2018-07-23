package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Annotation.Zoo;

public class Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring_Annotation.xml");
		
		Zoo zoo = (Zoo) applicationContext.getBean("zoo");
		System.out.println(zoo.toString() + "\n" + zoo.hashCode());
		Zoo zoo2 = (Zoo) applicationContext.getBean("zoo");
		System.out.println(zoo.toString() + "\n" + zoo2.hashCode());
	}
}
