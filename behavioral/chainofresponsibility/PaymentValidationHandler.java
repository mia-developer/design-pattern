package behavioral.chainofresponsibility;

public class PaymentValidationHandler implements PaymentHandler{

	private PaymentHandler nextHandler;

	@Override
	public void setNextHandler(final PaymentHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void execute(final PaymentRequest paymentRequest) throws IllegalAccessException {
		if (paymentRequest == null || paymentRequest.getAmount() == 0){
			throw new IllegalAccessException();
		}

		System.out.println("validated");

		if (nextHandler != null){
			nextHandler.execute(paymentRequest);
		}
	}
}
