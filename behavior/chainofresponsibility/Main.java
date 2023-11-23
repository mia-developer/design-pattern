package behavior.chainofresponsibility;

import behavior.command.CardPaymentCommand;
import behavior.command.Customer;
import behavior.command.PaymentProcessor;

public class Main {

	public static void main(String[] args) throws IllegalAccessException {
		PaymentProcessingHandler processingHandler = new PaymentProcessingHandler();
		PaymentValidationHandler validationHandler = new PaymentValidationHandler();
		validationHandler.setNextHandler(processingHandler);

		validationHandler.execute(new PaymentRequest(0));
	}
}
