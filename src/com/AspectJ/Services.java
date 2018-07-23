package com.AspectJ;

import org.springframework.stereotype.Service;

@Service
public class Services {

	public String  save(String message) {
		System.out.println("这是Services中的save方法");
		return "save success!";
	}
}
