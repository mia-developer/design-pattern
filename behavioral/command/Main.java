package behavioral.command;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(new PaymentProcessor());

		customer.pay(new CardPaymentCommand(100, "123-123-123"));
	}
}
