package behavior.state;

public class InitialOrderState extends OrderState{

	public InitialOrderState(final Order order) {
		super(order);
	}

	@Override
	public void process(){
		System.out.println("Processing order in initial state.");

		super.order.updateState(new ProcessingOrderState(super.order));
	}

	@Override
	public void cancel(){
		System.out.println("Cancelling order in initial state.");

		super.order.updateState(new CancelOrderState(super.order));
	}
}
