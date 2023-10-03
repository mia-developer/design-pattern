package creational.factorymethod.payment;

public abstract class Payment {

	private final Long amount;

	Payment(final Long amount){
		this.amount = amount;
	}

	public Long getAmount(){
		return this.amount;
	}
}
