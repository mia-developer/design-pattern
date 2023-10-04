package creational.prototype;

public class Money implements Cloneable{

	private final Long amount;

	public Long getAmount(){
		return this.amount;
	}

	public Money(final Long amount){
		this.amount = amount;
	}

	@Override
	public Money clone() {
		try {
			return (Money) super.clone();
		}
		catch (CloneNotSupportedException ex) {
			throw new RuntimeException("superclass messed up", ex);
		}
	}
}
