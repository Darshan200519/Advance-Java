package Service;

import Dao.CustomerDao;
import Entity.Customer;


public class CustomerService {
	public void insertData(Customer e) {
		CustomerDao dao = new CustomerDao();
		dao.insertData(e);
	}
		
		public void updateData(Customer e) {
			CustomerDao dao = new CustomerDao();
			dao.updateData(e);
			
		}

		public void deleteData(int customerId) {
			CustomerDao dao = new CustomerDao();
			dao.DeleteData(customerId); 
		}

		public void GetSingleData(int customerId) {
			CustomerDao dao = new CustomerDao();
			dao.GetSingleData(customerId);
		}
	}


