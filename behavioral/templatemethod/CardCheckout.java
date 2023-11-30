package behavioral.templatemethod;

public class CardCheckout extends Checkout {

	private final String cardNumber;

	public CardCheckout(final String cardNumber){
		this.cardNumber = cardNumber;
	}

	@Override
	void charge(final Long price, final Long paidAmount) {
		System.out.println("charged by card");
	}

	@Override
	protected void validate(final Long price, final Long paidAmount) throws IllegalAccessException {
		super.validate(price, paidAmount);

		if(cardNumber.length() > 100){
			throw new IllegalAccessException();
		}
	}
}
