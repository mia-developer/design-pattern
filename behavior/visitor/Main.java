package behavior.visitor;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Payment> payments = List.of(new Card(), new Cash());
		PaymentVisitor paymentVisitor = new PaymentProcessor();

		for(Payment payment : payments){
			payment.accept(paymentVisitor);
		}
	}
}
