package creational.builder;

public class Account {

	private String number;
	private String name;
	private Long amount;

	public Account(final String number, final String name, final Long amount){
		this.number = number;
		this.name = name;
		this.amount = amount;
	}

	public static Account.Builder builder() {
		return new Account.Builder();
	}

	public static class Builder{
		private String number;
		private String name;
		private Long amount;

		private Builder() {};

		public Builder number(final String number){
			this.number = number;
			return this;
		}

		public Builder name(final String name){
			this.name = name;
			return this;
		}

		public Builder amount(final Long amount){
			this.amount = amount;
			return this;
		}

		public Account build(){
			return new Account(this.number, this.name, this.amount);
		}
	}
}
