package behavior.strategy;

public class Checkout {

	private final TaxStrategy strategy;

	public Checkout(final TaxStrategy strategy){
		this.strategy = strategy;
	}

	public Receipt process(final long subtotal){
		long tax = strategy.calculate(subtotal);

		return new Receipt(subtotal, tax);
	}
}
