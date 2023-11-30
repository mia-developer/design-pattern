package behavioral.visitor;

public class Settlement implements Transaction {

	@Override
	public void accept(final ExcelExportVisitor visitor) {
		visitor.visit(this);
	}
}
