package behavior.visitor;

public class PaymentProcessor implements PaymentVisitor {

	@Override
	public void visitCard(final Card card) {
		System.out.println("visit CardService");
	}

	@Override
	public void visitCash(final Cash cash) {
		System.out.println("visit Cash");
	}
}
