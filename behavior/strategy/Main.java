package behavior.strategy;

public class Main {

	public static void main(String[] args) {
		Checkout checkout = new Checkout(new CardTaxStrategy());
		Receipt receipt = checkout.process(1000L);

		System.out.println("total : "+receipt.getTotal());
	}
}
