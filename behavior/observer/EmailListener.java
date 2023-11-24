package behavior.observer;

public class EmailListener implements PaymentEventListener {

	@Override
	public void process(final String event, final int amount) {
		System.out.println("email...");
	}
}
