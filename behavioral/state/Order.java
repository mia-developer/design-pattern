package behavioral.state;

public class Order {

	private OrderState state;

	public Order() {
		this.state = new InitialOrderState(this);
	}

	public void updateState(final OrderState state){
		this.state = state;
	}

	public void process(){
		this.state.process();
	}

	public void cancel(){
		this.state.cancel();
	}
}
