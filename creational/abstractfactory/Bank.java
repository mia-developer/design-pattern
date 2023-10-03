package creational.abstractfactory;

public interface Bank {

	Account createAccount(final String name);
	Card createCard(final String name);
}
