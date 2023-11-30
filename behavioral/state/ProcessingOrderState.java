package behavioral.state;

public class ProcessingOrderState extends OrderState{

	public ProcessingOrderState(final Order order) {
		super(order);
	}

	@Override
	public void cancel(){
		System.out.println("Cancelling order in processing state.");

		super.order.updateState(new CancelOrderState(super.order));
	}
}
