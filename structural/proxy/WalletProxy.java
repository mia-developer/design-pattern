package structural.proxy;

public class WalletProxy implements Wallet{
	private final String userName;
	private Wallet wallet;

	public WalletProxy(final String userName) {
		this.userName = userName;
	}

	@Override
	public void displayWallet() {
		if (wallet == null)
			wallet = new DigitalWallet(userName);

		wallet.displayWallet();
	}
}
