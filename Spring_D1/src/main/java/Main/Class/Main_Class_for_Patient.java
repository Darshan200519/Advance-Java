package Main.Class;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.com.Patient_Data;

public class Main_Class_for_Patient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		Patient_Data P = context.getBean("P",Patient_Data.class);
		
		P.setPatient_ID(205);
		P.setPatient_Name("Darshan Narjinair");
		P.setPatient_DOB("19 July 2005");
		P.setPatient_Age(21);
		P.setPatient_Address("Shirdi,Ahilyanagar");
		
		System.out.println(P);
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        Patient_Data P2 = context.getBean("P",Patient_Data.class);
		
		P2.setPatient_ID(206);
		P2.setPatient_Name("Sonali Narjinair");
		P2.setPatient_DOB("20 October 2002");
		P2.setPatient_Age(23);
		P2.setPatient_Address("Shirdi,Ahilyanagar");
		
		System.out.println(P);
		
		
	}

}
