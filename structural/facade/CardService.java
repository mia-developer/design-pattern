package structural.facade;

public class CardService {

	public static void charge(final Long amount) {
		System.out.println("CardService charge.... "+amount);
	}
}
