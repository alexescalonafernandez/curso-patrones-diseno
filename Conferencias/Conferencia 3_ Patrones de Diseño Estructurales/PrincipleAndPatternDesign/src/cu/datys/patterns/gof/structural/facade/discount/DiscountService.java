package cu.datys.patterns.gof.structural.facade.discount;

public class DiscountService {

	public boolean applyDiscount(Customer customer, Product product) {
		System.out.println("Applying discount for customer: " + customer.getName() +
				" product: " + product.getName());
		return true;
	}

}
