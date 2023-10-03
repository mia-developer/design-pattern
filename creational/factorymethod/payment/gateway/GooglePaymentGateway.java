package creational.factorymethod.payment.gateway;

import creational.factorymethod.payment.ApplePayment;
import creational.factorymethod.payment.GooglePayment;
import creational.factorymethod.payment.Payment;

public class GooglePaymentGateway extends PaymentGateway{

	@Override
	public Payment pay(final Long amount) {
		return new GooglePayment(amount);
	}
}
