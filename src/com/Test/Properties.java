package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Annotation.MyJdbcDriverManager;

public class Properties {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring_Properties.xml");
		MyJdbcDriverManager cj = (MyJdbcDriverManager) context.getBean("manager");
		System.out.println(cj.hashCode());
		
	}
}
