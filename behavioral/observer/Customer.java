package behavioral.observer;

public class Customer {

	private final PaymentProcessor processor;

	public Customer(final PaymentProcessor processor) {
		this.processor = processor;
	}

	public void pay(){
		processor.notify("payment", 1000);
	}
}
