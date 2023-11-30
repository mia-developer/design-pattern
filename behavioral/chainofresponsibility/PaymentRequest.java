package behavioral.chainofresponsibility;

public class PaymentRequest {

	private final int amount;

	public PaymentRequest(final int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}
}
