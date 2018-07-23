package com.Annotation;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 动物园
 * 凡帅  2018年3月27日下午9:10:14
 *
 *
 */
public class Zoo {

	@Autowired
//	@Resource  和@Autowired注解的作用一样，@Resouce是按照ByName方式去匹配bean，@Autowired是按照ByType去匹配bean
	private Tiger tiger;
	@Autowired
	private Monkey monkey;
	
//	
//	public void setTiger(Tiger tiger) {
//		this.tiger = tiger;
//	}
//
//
//	public void setMonkey(Monkey monkey) {
//		this.monkey = monkey;
//	}


	public String toString() {
		return tiger.toString() + "," + monkey.toString()+ " : "  + this.hashCode();
	}

	
	
}
