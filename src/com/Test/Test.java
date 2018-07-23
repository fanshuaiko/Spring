package com.Test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;
import com.resourceLoader.Demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

		// retrieve configured instance
//		 Student st = (Student) context.getBean("Student");
//		st.save();
		Demo demo = (Demo) context.getBean("Demo");
		try {
			demo.resource();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
