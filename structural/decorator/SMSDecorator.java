package structural.decorator;

public class SMSDecorator extends NotifierDecorator{

	public SMSDecorator(final Notifier notifier) {
		super(notifier);
	}

	@Override
	public void sendMessage(){
		super.sendMessage();
		System.out.println("SMS:: send message");
	}
}
