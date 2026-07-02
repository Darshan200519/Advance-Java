package com.dn;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Order_Status {
	
	@Before("execution (* com.dn.Food_Delivery.*(..))")
	public void beforeOrder() {
		System.out.println("Your Order Is Place....!");
		System.out.println("--------------------------------");
	}
	
	@After("execution (* com.dn.Food_Delivery.*(..))")
	public void AfterOrder() {
		System.out.println("Your Order Is Out For Delievery....!");
	}
	
//	@Around("execution (public void OrderISReady())")
//	public void BothCombo(ProceedingJoinPoint p) {
//		System.out.println("Your Order Is Place....!");
//		System.out.println("--------------------------------");
//		
//		try {
//			p.proceed();
//		} catch (Throwable e) {
//			e.printStackTrace();
//			
//		}
//		System.out.println("Your Order Is Out For Delivery....!");
//		
//	}

}
