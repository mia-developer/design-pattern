package behavioral.memento;

public class Main {

	public static void main(String[] args) {
		Payment payment = new Payment();
		PaymentHistoryCaretaker caretaker = new PaymentHistoryCaretaker(payment);

		payment.execute(new PaymentState("confirmed", 1000));
		caretaker.saveHistory();

		payment.execute(new PaymentState("canceled", 1000));
		caretaker.restore();
	}
}
