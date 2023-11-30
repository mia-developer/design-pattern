package behavioral.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class PaymentIterator implements Iterator<Payment> {

	private final List<Payment> payments;
	private int cursor;

	public PaymentIterator(final List<Payment> payments) {
		this.payments = payments;
	}

	@Override
	public boolean hasNext() {
		return cursor < payments.size();
	}

	@Override
	public Payment next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return payments.get(cursor++);
	}
}
