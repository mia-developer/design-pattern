package behavior.visitor;

public class Card implements Payment {

	@Override
	public void accept(final PaymentVisitor paymentVisitor) {
		paymentVisitor.visitCard(this);
	}
}
