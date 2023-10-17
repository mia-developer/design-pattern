package structural.decorator;

public class PaymentNotifier implements Notifier{

	@Override
	public void sendMessage() {
		System.out.println("send message");
	}
}
