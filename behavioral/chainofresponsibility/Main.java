package behavioral.chainofresponsibility;

public class Main {

	public static void main(String[] args) throws IllegalAccessException {
		PaymentProcessingHandler processingHandler = new PaymentProcessingHandler();
		PaymentValidationHandler validationHandler = new PaymentValidationHandler();
		validationHandler.setNextHandler(processingHandler);

		validationHandler.execute(new PaymentRequest(0));
	}
}
