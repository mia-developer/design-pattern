package behavioral.visitor;

public interface Transaction {

	void accept(final ExcelExportVisitor visitor);
}
