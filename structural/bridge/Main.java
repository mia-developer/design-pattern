package structural.bridge;

public class Main {

	public static void main(String[] args) {
		PaymentGateway paymentGateway = new ApplePay(new CreditCard());

		paymentGateway.pay();
	}
}
