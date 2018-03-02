package cu.datys.patterns.gof.structural.adapter.customer;

public class CustomerAdapterCSV implements Customer {

	private CustomerCSV instance;
	
	public CustomerAdapterCSV(CustomerCSV instance) {
		this.instance = instance;
	}
	
	@Override
	public String getId() {
		return String.valueOf(instance.getId());
	}

	@Override
	public String getFirstName() {
		return instance.getFirstname();
	}

	@Override
	public String getLastName() {
		return instance.getLastname();
	}

	@Override
	public String getEmail() {
		return instance.getEmailAddress();
	}

}
