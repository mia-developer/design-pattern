package structural.flyweight;

public class Receipt {

	private final Store store;
	private final String product;
	private final int amount;

	public Receipt(final Store store, final String product, final int amount) {
		this.store = store;
		this.product = product;
		this.amount = amount;
	}

	public Store getStore() {
		return this.store;
	}
}
