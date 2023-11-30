package behavioral.command;

public class PaymentProcessor {

	public void process(final PaymentCommand command){
		command.execute();
	}
}
