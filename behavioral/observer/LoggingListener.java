package behavioral.observer;

public class LoggingListener implements PaymentEventListener{

	@Override
	public void process(final String event, final int amount) {
		System.out.println("logging...");
	}
}
