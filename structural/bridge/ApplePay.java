package structural.bridge;

public class ApplePay implements PaymentGateway{

	private final PaymentMethod paymentMethod;

	public ApplePay(final PaymentMethod paymentMethod){
		this.paymentMethod = paymentMethod;
	}

	@Override
	public void pay() {
		paymentMethod.pay();
		System.out.println("and using apple pay");
	}
}
