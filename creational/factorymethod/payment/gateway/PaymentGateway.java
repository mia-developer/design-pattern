package creational.factorymethod.payment.gateway;

import creational.factorymethod.payment.PaymentType;
import creational.factorymethod.payment.Payment;

public abstract class PaymentGateway {

	public abstract Payment pay(final Long amount);

	public static PaymentGateway getInstance(final PaymentType type){
		return createPayment(type);
	}

	private static PaymentGateway createPayment(final PaymentType type) {
		switch (type){
			case APPLE -> new ApplePaymentGateway();
			case GOOGLE -> new GooglePaymentGateway();
		}
		throw new IllegalArgumentException();
	}
}
