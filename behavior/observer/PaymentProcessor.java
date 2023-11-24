package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentProcessor {

	private final List<PaymentEventListener> listeners = new ArrayList<>();

	public void subscribe(final PaymentEventListener listener){
		listeners.add(listener);
	}

	public void unsubscribe(final PaymentEventListener listener){
		listeners.remove(listener);
	}

	public void notify(final String event, final int amount){
		listeners.forEach(v -> v.process(event, amount));
	}

}
