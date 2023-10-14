package behavior.visitor;

public interface Payment {

	void accept(final PaymentVisitor paymentVisitor);
}
