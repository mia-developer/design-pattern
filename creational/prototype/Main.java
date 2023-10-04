package creational.prototype;

public class Main {

	public static void main(String[] args) {
		Money money = new Money(100L);
		Money cloneMoney = money.clone();

		System.out.println(money.getAmount().equals(cloneMoney.getAmount()));
	}
}
