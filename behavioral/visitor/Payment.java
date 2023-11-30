package behavioral.visitor;

public class Payment implements Transaction {

	@Override
	public void accept(final ExcelExportVisitor visitor) {
		visitor.visit(this);
	}
}
