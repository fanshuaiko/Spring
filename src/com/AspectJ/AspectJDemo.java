package com.AspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectJDemo {

	@DeclareParents(value="com.AspectJ.*+" , defaultImpl=com.AspectJ.FitImpl.class)
	public   Fit fit;
	
	@Pointcut("execution(* com.AspectJ.Services.*(..))")
	public void  pointcut() {
		
	}
	@Before("pointcut()")
	public void before() {
		System.out.println("Aspect中的before方法");
	}
	
	//带参数
	@Before("pointcut() && args(messa)")
	public void beforeWithParam(String messa) {
		System.out.println("Aspect中的beforeWithParam方法:" + messa);
	}
	
	//returning是Services中执行方法后的返回值
	@AfterReturning(pointcut="pointcut()",returning="returnValue")
	public void afterReturning(Object returnValue) {
		System.out.println("AfterReturning:" + returnValue);
	}
	//最终通知必须准备处理正常和异常两种返回情况，它通常用于释放资源
	@After("pointcut()")
	public void after() {
		System.out.println("Aspect中的After方法");
	}
	//环绕通知
	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("方法执行前");
		Object obj = pjp.proceed();
		System.out.println("方法执行后");
		return obj;
	}
	
	
	
	
}
