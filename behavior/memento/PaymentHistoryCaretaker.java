package behavior.memento;

import behavior.memento.Payment.PaymentMemento;
import java.util.Stack;

public class PaymentHistoryCaretaker {

	private final Payment payment;
	private final Stack<PaymentMemento> histories = new Stack<>();

	public PaymentHistoryCaretaker(final Payment payment){
		this.payment = payment;
	}

	public void saveHistory(){
		histories.add(payment.getMemento());
	}

	public void restore(){
		payment.restore(histories.pop());
	}
}
