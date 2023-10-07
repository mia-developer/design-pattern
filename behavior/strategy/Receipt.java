package behavior.strategy;

public class Receipt {

	private long subtotal;
	private long tax;

	public Receipt(final long subtotal, final long tax) {
		this.subtotal = subtotal;
		this.tax = tax;
	}

	public Long getTotal(){
		return this.subtotal + this.tax;
	}
}
