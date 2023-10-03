package creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class MiaBank implements Bank {

	private Map<String, Account> accountMap = new HashMap<>();
	private Map<String, Card> cardMap = new HashMap<>();

	@Override
	public Account createAccount(final String name) {
		accountMap.put(name, new MiaAccount(name));
		return accountMap.get(name);
	}

	@Override
	public Card createCard(final String name) {
		if (!accountMap.containsKey(name)){
			return null;
		}

		cardMap.put(name, new MiaCard(name));
		return cardMap.get(name);
	}
}
