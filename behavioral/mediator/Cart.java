package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Cart extends Component{

	private List<Product> products = new ArrayList<>();

	public List<Product> getProducts() {
		return this.products;
	}

	public void addProducts(List<Product> products) {
		this.products.addAll(products);

		products.forEach(v -> System.out.println("Add To Card:: "+v));
	}

	public void clear(){
		this.products = new ArrayList<>();
	}
}
