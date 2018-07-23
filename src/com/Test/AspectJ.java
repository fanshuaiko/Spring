package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AspectJ.Fit;
import com.AspectJ.Services;


public class AspectJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring_AspectJ.xml");
		Services services = (Services) ac.getBean("services");
		services.save("message");
		
		
		Fit fit = (Fit) ac.getBean("services");
		fit.filter();
	}

}
