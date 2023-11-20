package behavior.visitor;

public class ExcelExportProcessor implements ExcelExportVisitor {

	@Override
	public void visit(final Payment payment) {
		System.out.println("export payment...");
	}

	@Override
	public void visit(final Settlement settlement) {
		System.out.println("export settlement...");
	}
}
