package behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class Cart extends Component{

	private List<Product> products = new ArrayList<>();

	protected Cart(final Mediator mediator) {
		super(mediator);
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void addProducts(List<Product> products) {
		this.products.addAll(products);
	}

	public void clear(){
		this.products = new ArrayList<>();
	}
}
