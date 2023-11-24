package behavior.observer;

public interface PaymentEventListener {

	void process(final String event, final int amount);
}
