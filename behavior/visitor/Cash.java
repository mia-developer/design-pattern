package behavior.visitor;

public class Cash implements Payment {

	@Override
	public void accept(final PaymentVisitor paymentVisitor) {
		paymentVisitor.visitCash(this);
	}
}
