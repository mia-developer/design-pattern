package behavioral.mediator;

import java.util.List;

public interface Mediator {

	void placeOrder();

	void addToCart(final List<Product> products);
}
