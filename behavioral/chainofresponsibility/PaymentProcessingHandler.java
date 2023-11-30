package behavioral.chainofresponsibility;

public class PaymentProcessingHandler implements PaymentHandler{

	private PaymentHandler nextHandler;

	@Override
	public void setNextHandler(final PaymentHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void execute(final PaymentRequest paymentRequest) throws IllegalAccessException {
		if (paymentRequest == null){
			throw new IllegalAccessException();
		}

		System.out.println("processed");

		if (nextHandler != null){
			nextHandler.execute(paymentRequest);
		}
	}
}
