package structural.flyweight;

public class Main {

	public static void main(String[] args) {
		StoreFactory factory = new StoreFactory();
		
		String storeName = "welcomeStore";
		Store store = factory.getStore(storeName);

		Receipt firstReceipt = new Receipt(store, "shirts", 2);
		Receipt secondReceipt = new Receipt(store, "shirts", 4);

		System.out.println(firstReceipt.getStore());
		System.out.println(secondReceipt.getStore());
	}
}
