package behavioral.mediator;

public class Product {

	private final String name;

	public Product(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product{" +
			 "name='" + name + '\'' +
			 '}';
	}
}
