package com.resourceLoader;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class Demo implements ApplicationContextAware{

	private ApplicationContext applicationContext;

	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
	}
	 public void resource() throws IOException {
		Resource resource =  applicationContext.getResource("f.txt");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	 }
	 
	
	
}
