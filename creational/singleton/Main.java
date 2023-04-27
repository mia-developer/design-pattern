package creational.singleton;

public class Main {

	public static void main(String[] args) {

		SingletonPattern firstInstance = SingletonPattern.getInstance();
		SingletonPattern secondInstance = SingletonPattern.getInstance();

		System.out.println(firstInstance);
		System.out.println(secondInstance);

		System.out.println(firstInstance.equals(secondInstance));
	}
}
