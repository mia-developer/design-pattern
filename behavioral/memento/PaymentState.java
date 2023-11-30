package behavioral.memento;

public class PaymentState {

	private final String status;
	private final int amount;

	public PaymentState(final String status, final int amount) {
		this.status = status;
		this.amount = amount;
	}
}
