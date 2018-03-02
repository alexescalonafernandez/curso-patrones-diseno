package cu.datys.patterns.gof.structural.facade.discount;

import java.math.BigDecimal;

public class ProductService {

	public Product findProductBy(long idProduct) {
		return new Product(1L, "POS", new BigDecimal("100"));
	}

}
