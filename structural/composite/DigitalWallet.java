package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DigitalWallet {

	private List<PaymentMethod> paymentMethods = new ArrayList<>();

	public DigitalWallet(){}

	public void addPaymentMethod(final PaymentMethod paymentMethod){
		this.paymentMethods.add(paymentMethod);
	}

	public void removePaymentMethod(final PaymentMethod paymentMethod){
		this.paymentMethods.remove(paymentMethod);
	}
}
