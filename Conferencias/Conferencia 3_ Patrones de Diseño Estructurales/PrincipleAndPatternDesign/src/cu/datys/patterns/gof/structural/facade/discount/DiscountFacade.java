package cu.datys.patterns.gof.structural.facade.discount;

public class DiscountFacade {
	
	private CustomerService customerService = new CustomerService();
	private ProductService productService = new ProductService();
	private DiscountService discountService = new DiscountService();
	
	public boolean applyDiscount(ApplyDiscountRequest discountRequest) {
		Customer customer = customerService.findProductBy(discountRequest.getIdCustomer());
		Product product = productService.findProductBy(discountRequest.getIdProduct());
		return discountService.applyDiscount(customer, product);
	}
	
}
