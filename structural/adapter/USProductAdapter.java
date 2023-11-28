package structural.adapter;

import java.math.BigDecimal;
import java.util.List;

public class USProductAdapter implements ProductProvider{

	private final ProductCatalog productCatalog;
	private final BigDecimal exchangeRate = BigDecimal.valueOf(1.357);

	public USProductAdapter(final ProductCatalog productCatalog) {
		this.productCatalog = productCatalog;
	}

	public List<Product> getProducts(){
		return productCatalog.getProducts().stream()
			 .map(this::localization)
			 .toList();
	}

	private Product localization(final Product product){
		String name = product.getName()+"_US";
		BigDecimal amount = product.getAmount().multiply(exchangeRate);

		return new Product(name, amount);
	}
}
