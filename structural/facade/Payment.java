package structural.facade;

public class Payment {

	public static void execute(final Long amount){
		PGService.pay(amount);
		CardService.charge(amount);
		BankService.transfer(amount);
	}
}
