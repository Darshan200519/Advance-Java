package DN.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyconfigClass.class);
		
		Customer C = context.getBean(Customer.class);
		
		System.out.println(C.getCar1().Car_Company());
		System.out.println(C.getCar2().Car_Company());
	
	}

}
