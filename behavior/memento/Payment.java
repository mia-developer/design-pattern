package behavior.memento;

public class Payment {

	private PaymentState state;

	public void execute(final PaymentState state){
		this.state = state;
	}

	public PaymentMemento getMemento(){
		return new PaymentMemento(state);
	}

	public void restore(final PaymentMemento memento){
		this.state = memento.getState();
	}

	static class PaymentMemento{
		private final PaymentState state;

		private PaymentMemento(final PaymentState state){
			this.state = state;
		}

		private PaymentState getState(){
			return this.state;
		}
	}
}

