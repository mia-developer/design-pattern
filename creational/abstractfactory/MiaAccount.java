package creational.abstractfactory;

public class MiaAccount implements Account{

	private final String name;

	public MiaAccount(final String name){
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
