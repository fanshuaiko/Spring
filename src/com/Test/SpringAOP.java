package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringAOP.Fit;
import com.SpringAOP.Services;

public class SpringAOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringAOP.xml");
		Services sc = (Services) ac.getBean("services");
		
//		sc.serv();
		
		sc.init("name", 3);
	
		//允许一个切面声明一个实现指定接口的通知对象，并且提供了一个接口实现类来代表这些对象
		Fit fit = (Fit) ac.getBean("services");
		fit.filter();
		
		
	}

}
