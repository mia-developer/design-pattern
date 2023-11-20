package behavior.visitor;

public interface Transaction {

	void accept(final ExcelExportVisitor visitor);
}
