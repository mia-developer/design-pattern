package behavioral.mediator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator(new Cart(), new Order(), new Payment());

		mediator.addToCart(List.of(new Product("pencil")));
		mediator.placeOrder();
	}
}
