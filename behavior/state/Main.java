package behavior.state;

import behavior.strategy.CardTaxStrategy;
import behavior.strategy.Checkout;
import behavior.strategy.Receipt;

public class Main {

	public static void main(String[] args) {
		Order order = new Order();

		order.process();
		order.cancel();
		order.cancel();
	}
}
