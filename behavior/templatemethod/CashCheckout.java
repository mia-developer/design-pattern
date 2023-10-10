package behavior.templatemethod;

public class CashCheckout extends Checkout{

	@Override
	void charge(final Long price, final Long paidAmount) {
		System.out.println("charged by cash");
	}
}
