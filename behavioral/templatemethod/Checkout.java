package behavioral.templatemethod;

public abstract class Checkout {

	public void process(final Long price, final Long paidAmount) throws IllegalAccessException {
		this.validate(price, paidAmount);
		this.authenticate();
		this.charge(price, paidAmount);
	}

	abstract void charge(final Long price, final Long paidAmount);

	private void authenticate(){
		System.out.println("authenticate");
	}

	protected void validate(final Long price, final Long paidAmount) throws IllegalAccessException {
		if(price > paidAmount){
			throw new IllegalAccessException();
		}
		System.out.println("validate");
	}

}
