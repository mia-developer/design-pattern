package structural.proxy;

public class DigitalWallet implements Wallet{

	private final String userName;

	public DigitalWallet(final String userName) {
		this.userName = userName;
	}

	@Override
	public void displayWallet() {
		System.out.println(this.userName+"'s wallet");
	}
}
