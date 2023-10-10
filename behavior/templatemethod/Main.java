package behavior.templatemethod;

public class Main {

	public static void main(String[] args) throws IllegalAccessException {
		new CardCheckout("cardNumber").process(100L, 100L);
		new CashCheckout().process(200L, 200L);
	}
}
