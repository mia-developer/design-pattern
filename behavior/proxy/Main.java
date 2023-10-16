package behavior.proxy;

public class Main {

	public static void main(String[] args) {
		Wallet wallet = new WalletProxy("james");

		wallet.displayWallet();
	}
}
