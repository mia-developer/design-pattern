package behavioral.mediator;

public abstract class Component {

	private Mediator mediator;

	protected void setMediator(final Mediator mediator) {
		this.mediator = mediator;
	}
}
