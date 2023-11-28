package structural.adapter;

import java.math.BigDecimal;

public class Product {

	private final String name;
	private final BigDecimal amount;

	public Product(final String name, final BigDecimal amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return this.name;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	@Override
	public String toString() {
		return "Product{" +
			 "name='" + name + '\'' +
			 ", amount=" + amount +
			 '}';
	}
}
