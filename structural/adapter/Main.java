package structural.adapter;

import java.util.List;
import structural.bridge.ApplePay;
import structural.bridge.CreditCard;
import structural.bridge.PaymentGateway;

public class Main {

	public static void main(String[] args) {
		ProductProvider productProvider = new USProductAdapter(new ProductCatalog());
		List<Product> products = productProvider.getProducts();

		products.forEach(System.out::println);
	}
}
