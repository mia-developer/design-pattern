package creational.factorymethod.payment.gateway;

import creational.factorymethod.payment.ApplePayment;
import creational.factorymethod.payment.Payment;

public class ApplePaymentGateway extends PaymentGateway{

	@Override
	public Payment pay(final Long amount) {
		return new ApplePayment(amount);
	}
}
