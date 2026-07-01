package DN.com;

import org.springframework.stereotype.Component;

@Component("BMW")
public class BMW_X5 implements Car {

	@Override
	public String Car_Company() {
		return "BUY THE BMW_X5";
	}

}
