package behavioral.visitor;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Transaction> transactions = List.of(new Payment(), new Settlement());
		ExcelExportVisitor visitor = new ExcelExportProcessor();

		for(Transaction transaction : transactions){
			transaction.accept(visitor);
		}
	}
}
