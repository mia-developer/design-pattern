package structural.decorator;

public abstract class NotifierDecorator implements Notifier{

	private final Notifier notifier;

	public NotifierDecorator(final Notifier notifier){
		this.notifier = notifier;
	}

	@Override
	public void sendMessage(){
		notifier.sendMessage();
	}
}
