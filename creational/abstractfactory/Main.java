package creational.abstractfactory;

public class Main {

	public static void main(String[] args) {
		String USER_NAME = "kim";

		Bank bank = new MiaBank();
		Account account = bank.createAccount(USER_NAME);
		Card card = bank.createCard(USER_NAME);

		System.out.println(account.getName());
		System.out.println(card.getName());
	}
}
