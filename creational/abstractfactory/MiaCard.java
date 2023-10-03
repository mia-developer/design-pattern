package creational.abstractfactory;

public class MiaCard implements Card{
	private final String name;

	public MiaCard(final String name){
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
