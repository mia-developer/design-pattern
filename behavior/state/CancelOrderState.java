package behavior.state;

public class CancelOrderState extends OrderState{

	public CancelOrderState(final Order order) {
		super(order);
	}

	@Override
	public void process(){
		System.out.println("Processing order in cancel state.");

		super.order.updateState(new ProcessingOrderState(super.order));
	}
}
