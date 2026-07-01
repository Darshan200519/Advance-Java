package DN.com;

import org.springframework.stereotype.Component;

@Component("FORTUNER")
public class Fortuner_Legender implements Car {

	@Override
	public String Car_Company() {
		return "BUY THE FORTUNER LEGENDER CAR";
	}

}
