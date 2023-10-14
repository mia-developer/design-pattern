package behavior.visitor;

public interface PaymentVisitor {

	void visitCard(final Card card);
	void visitCash(final Cash cash);
}
