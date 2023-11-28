package structural.adapter;

import java.math.BigDecimal;
import java.util.List;

public class ProductCatalog implements ProductProvider{

	@Override
	public List<Product> getProducts() {
		return List.of(new Product("apple", BigDecimal.valueOf(10000)));
	}
}
