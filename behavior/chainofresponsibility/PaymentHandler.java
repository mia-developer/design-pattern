package behavior.chainofresponsibility;

public interface PaymentHandler {

	void setNextHandler(final PaymentHandler nextHandler);
	void execute(final PaymentRequest paymentRequest) throws IllegalAccessException;
}
