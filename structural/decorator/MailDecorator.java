package structural.decorator;

public class MailDecorator extends NotifierDecorator{

	public MailDecorator(final Notifier notifier) {
		super(notifier);
	}

	@Override
	public void sendMessage(){
		super.sendMessage();
		System.out.println("Mail:: send message");
	}
}
