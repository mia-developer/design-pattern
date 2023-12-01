package behavioral.mediator;

import java.util.List;

public class Payment extends Component {

	public void execute(final List<Product> products) {
		products.forEach(v -> System.out.println("Paid:: "+v));
	}
}
