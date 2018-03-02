package cu.datys.patterns.gof.structural.facade.discount;

import java.util.Date;

public class CustomerService {
	
	public Customer findProductBy(long idCustomer) {
		return new Customer("Vader", "Imperial City", new Date());
	}

}
