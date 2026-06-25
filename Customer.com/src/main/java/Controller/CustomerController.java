package Controller;

import java.util.Scanner;

import Service.CustomerService;
import Entity.Customer;

public class CustomerController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerService service = new CustomerService();
		
		System.out.println("1. Insert");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		System.out.println("4. Get Single Data");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			Customer e = new Customer();

			System.out.print("Enter Customer ID ");
			e.setCustomerId(sc.nextInt());

			sc.nextLine(); 

			System.out.print("Enter Adhar Number ");
			e.setAadhaarNumber(sc.nextLong());
			sc.nextLine(); 
			

			System.out.print("Enter PAN Number: ");
			e.setPANnumber(sc.nextLine());

			System.out.print("Enter FullName ");
			e.setFullname(sc.nextLine());
			
			System.out.print("Enter DOB ");
			e.setDOB(sc.nextLine());
			
			System.out.print("Enter Gender");
			e.setGender(sc.nextLine());

			System.out.print("Enter Mobile No: ");
			e.setMobileNo(sc.nextLong());
			sc.nextLine(); 
			
			System.out.print("Enter Email ID");
			e.setEmailID(sc.nextLine());
			
			System.out.print("Enter Permanent Add");
			e.setPermanentAdd(sc.nextLine());
			System.out.print("Enter Current Add");
			e.setCurrentAdd(sc.nextLine());
			System.out.print("Enter Account No: ");
			e.setAccountNumber(sc.nextLong());
			sc.nextLine(); 
			
			System.out.print("Enter Credit Score");
			e.setCreditScore(sc.nextInt());

			sc.nextLine(); 
			System.out.print("Enter Annual Income");
			e.setAnnualIncome(sc.nextInt());

			sc.nextLine(); 
			System.out.print("Enter Occupation");
			e.setOccupation(sc.nextLine());
			System.out.print("Enter Nationality");
			e.setNationality(sc.nextLine());
		
			service.insertData(e);
			break;
		case 2: 
			System.out.print("Enter ID to update: ");
			int updateCustomerId = sc.nextInt();
			sc.nextLine();
            Customer c1 = new Customer();
			c1.setCustomerId(updateCustomerId);
			System.out.print("Enter new Adhar Number ");
			c1.setAadhaarNumber(sc.nextLong());
			sc.nextLine(); 
			

			System.out.print("Enter new PAN Number: ");
			c1.setPANnumber(sc.nextLine());

			System.out.print("Enter new FullName ");
			c1.setFullname(sc.nextLine());
			
			System.out.print("Enter new DOB ");
			c1.setDOB(sc.nextLine());
			
			System.out.print("Enter new Gender");
			c1.setGender(sc.nextLine());

			System.out.print("Enter new Mobile No: ");
			c1.setMobileNo(sc.nextLong());
			sc.nextLine(); 
			
			System.out.print("Enter new Email ID");
			c1.setEmailID(sc.nextLine());
			
			System.out.print("Enter new Permanent Add");
			c1.setPermanentAdd(sc.nextLine());
			System.out.print("Enter new Current Add");
			c1.setCurrentAdd(sc.nextLine());
			System.out.print("Enter new Account No: ");
			c1.setAccountNumber(sc.nextLong());
			sc.nextLine(); 
			
			System.out.print("Enter new Credit Score");
			c1.setCreditScore(sc.nextInt());

			sc.nextLine(); 
			System.out.print("Enter new Annual Income");
			c1.setAnnualIncome(sc.nextInt());

			sc.nextLine(); 
			System.out.print("Enter new Occupation");
			c1.setOccupation(sc.nextLine());
			System.out.print("Enter new Nationality");
			c1.setNationality(sc.nextLine());
			service.updateData(c1);
			break;
			
		case 3:
			System.out.print("Enter ID to delete: ");
			int deleteId = sc.nextInt();
			service.deleteData(deleteId);
			break;
		case 4 :
			System.out.print("Enter ID to fetch: ");
			int getId = sc.nextInt();
			service.GetSingleData(getId);
			break;
		default:
			System.out.println("Invalid choice!");
		}

		sc.close();

	}

}
