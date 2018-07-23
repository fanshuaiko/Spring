package com.SpringAOP;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类 凡帅 2018年3月28日下午4:05:47
 *
 *
 */
public class Aspect {

	
	public void before() {
		System.out.println("Aspect中的before方法====");
	}

	public void afterReturning() {
		System.out.println("Aspect中的afterReturning方法====");
	}

	public void throwIng() {
		System.out.println("Aspect中的throwIng方法===");
	}

	public void after() {
		System.out.println("Aspect中的after方法===");
	}

	// 环绕通知方法中的第一个参数必须为ProceedingJoinPoint
	public Object around(ProceedingJoinPoint pjp) {
		Object obj = null;
		try {
			System.out.println("Aspect中around方法执行业务方法之前");

			obj = pjp.proceed();// 执行业务类中方法

			System.out.println("Aspect中around方法执行业务方法之后");

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	public Object aroundInit(ProceedingJoinPoint pjp, String name, int times) {
		System.out.println("aroundInit方法中  " + name + ":" + times);
		Object obj = null;
		try {
			System.out.println("Aspect中aroundInit方法执行业务方法之前");

			obj = pjp.proceed();// 执行业务类中方法

			System.out.println("Aspect中aroundInit方法执行业务方法之后");

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
