package com.entity;

public class Student {
	private Address address;
	

	//设值注入
	public void setAddress(Address address) {
		this.address = address;
	} 
	
	public void save() {
		System.out.println("这是Student的save方法");
		address.getPostNumber();
	}
//	//构造注入
//	public Student(Address address) {
//		super();
//		this.address = address;
//	}

	
	
	
}
