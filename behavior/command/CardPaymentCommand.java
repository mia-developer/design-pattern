package behavior.command;

public class CardPaymentCommand implements PaymentCommand{

	private final int amount;
	private final String cardNumber;

	CardPaymentCommand(final int amount, final String cardNumber){
		this.amount = amount;
		this.cardNumber = cardNumber;
	}


	@Override
	public void execute() {
		System.out.println("payment of "+amount+" with card number "+cardNumber);
	}
}
