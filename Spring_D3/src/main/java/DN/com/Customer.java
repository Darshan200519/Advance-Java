package DN.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Customer {
	@Qualifier("FORTUNER")
	@Autowired
	Car car1 ;
	
	@Qualifier("BMW")
	@Autowired
	Car car2 ;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [car1=" + car1 + ", car2=" + car2 + "]";
	}

	public Car getCar1() {
		return car1;
	}

	public void setCar1(Car car1) {
		this.car1 = car1;
	}

	public Car getCar2() {
		return car2;
	}

	public void setCar2(Car car2) {
		this.car2 = car2;
	}

	public Customer(Car car1, Car car2) {
		super();
		this.car1 = car1;
		this.car2 = car2;
	}
	
	
	

}
