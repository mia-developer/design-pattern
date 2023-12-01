package behavioral.mediator;

import java.util.List;

public class ConcreteMediator implements Mediator{
	private final Cart cart;
	private final Order order;
	private final Payment payment;

	public ConcreteMediator(final Cart cart, final Order order, final Payment payment) {
		this.cart = cart;
		this.order = order;
		this.payment = payment;

		cart.setMediator(this);
		order.setMediator(this);
		payment.setMediator(this);
	}

	@Override
	public void addToCart(final List<Product> products){
		cart.addProducts(products);
	}

	@Override
	public void placeOrder() {
		payment.execute(cart.getProducts());
		order.execute(cart.getProducts());
		cart.clear();
	}
}
