package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Entity.Customer;




public class CustomerDao {
	public void insertData(Customer e) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(e);

		System.out.println("Inserted ...!");
		tr.commit();
		ss.close();
	}
	
	public void updateData(Customer e) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);
		
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Customer emp = ss.get(Customer.class, e.getCustomerId());

		if (emp != null) {
			emp.setAadhaarNumber(e.getAadhaarNumber());
			emp.setPANnumber(e.getPANnumber());
			emp.setFullname(e.getFullname());
			emp.setDOB(e.getDOB());
			emp.setGender(e.getGender());
			emp.setMobileNo(e.getMobileNo());
			emp.setEmailID(e.getEmailID());
			emp.setPermanentAdd(e.getPermanentAdd());
			emp.setCurrentAdd(e.getCurrentAdd());
			emp.setAccountNumber(e.getAccountNumber());
			emp.setCreditScore(e.getCreditScore());
			emp.setAnnualIncome(e.getAnnualIncome());
			emp.setOccupation(e.getOccupation());
			emp.setNationality(e.getNationality());
			

			ss.merge(emp);
			System.out.println("Updated ...!");
		} else {
			System.out.println("Customer not found!");
		}

		tr.commit();
		ss.close();
	}
	public void DeleteData(int customerId) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);
		
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Customer e = ss.get(Customer.class, customerId);

		if (e != null) {
			ss.remove(e);
			System.out.println("Deleted ...!");
		} else {
			System.out.println("Customer not found!");
		}

		tr.commit();
		ss.close();
	}
	public void GetSingleData(int customerId) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);
		
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Customer e = ss.get(Customer.class,customerId );

		if (e != null) {
			System.out.println(e);
		} else {
			System.out.println("Customer not found!");
		}

		tr.commit();
		ss.close();
	}

}
