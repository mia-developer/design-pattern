package behavioral.state;

public class Main {

	public static void main(String[] args) {
		Order order = new Order();

		order.process();
		order.cancel();
		order.cancel();
	}
}
