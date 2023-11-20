package behavior.visitor;

public interface ExcelExportVisitor {

	void visit(final Payment payment);
	void visit(final Settlement settlement);
}
