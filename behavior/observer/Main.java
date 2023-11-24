package behavior.observer;

import creational.prototype.Money;

public class Main {

	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();
		processor.subscribe(new EmailListener());
		processor.subscribe(new LoggingListener());

		Customer customer = new Customer(processor);

		customer.pay();
	}
}
