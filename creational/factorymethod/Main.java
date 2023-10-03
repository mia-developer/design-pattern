package creational.factorymethod;

import creational.factorymethod.payment.Payment;
import creational.factorymethod.payment.PaymentType;
import creational.factorymethod.payment.gateway.PaymentGateway;

public class Main {

	public static void main(String[] args) {
		PaymentGateway paymentGateway = PaymentGateway.getInstance(PaymentType.APPLE);
		Payment payment = paymentGateway.pay(100L);

		System.out.println(payment.getAmount());
	}
}
