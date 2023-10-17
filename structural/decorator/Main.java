package structural.decorator;

public class Main {

	public static void main(String[] args) {
		Notifier notifier = new SMSDecorator(new PaymentNotifier());

		notifier.sendMessage();
	}
}
