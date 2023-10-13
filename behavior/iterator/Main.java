package behavior.iterator;

import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Iterator<Payment> iterator = new PaymentIterator(List.of(new Payment(100L)));
		while(iterator.hasNext()){
			Payment payment = iterator.next();

			System.out.println(payment.getAmount());
		}
	}
}
