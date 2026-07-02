package com.dn;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_Class {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		Food_Delivery F = context.getBean(Food_Delivery.class) ;
		
		F.OrderISReady();
		
	}

}
