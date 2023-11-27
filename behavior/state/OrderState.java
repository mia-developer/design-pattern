package behavior.state;

public abstract class OrderState {

	protected final Order order;

	public OrderState(final Order order) {
		this.order = order;
	}

	public void process(){
		throw new UnsupportedOperationException();
	}

	public void cancel(){
		throw new UnsupportedOperationException();
	}
}
