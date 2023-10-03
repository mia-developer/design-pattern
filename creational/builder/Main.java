package creational.builder;

public class Main {

	public static void main(String[] args) {
		Account account = Account.builder()
			 .number("1234-5678")
			 .name("kim")
			 .amount(1000L)
			 .build();

		System.out.println(account);
	}
}
