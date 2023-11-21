package behavior.command;

public class Customer {

	private final PaymentProcessor paymentProcessor;

	Customer(final PaymentProcessor paymentProcessor){
		this.paymentProcessor = paymentProcessor;
	}

	public void pay(final PaymentCommand command){
		paymentProcessor.process(command);
	}
}
