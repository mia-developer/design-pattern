package behavior.command;

import behavior.visitor.ExcelExportProcessor;
import behavior.visitor.ExcelExportVisitor;
import behavior.visitor.Payment;
import behavior.visitor.Settlement;
import behavior.visitor.Transaction;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(new PaymentProcessor());

		customer.pay(new CardPaymentCommand(100, "123-123-123"));
	}
}
