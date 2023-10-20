package structural.bridge;

public class CreditCard implements PaymentMethod{

	@Override
	public void pay() {
		System.out.println("pay with credit card");
	}
}
