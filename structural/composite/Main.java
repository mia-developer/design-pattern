package structural.composite;

public class Main {

	public static void main(String[] args) {
		DigitalWallet wallet = new DigitalWallet();

		wallet.addPaymentMethod(new DebitCard());
		wallet.addPaymentMethod(new CreditCard());
	}
}
