import java.util.Arrays;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"A", "B", "C"};
		String[] suits1 = {"Giraffes", "Lions"};
		int[] pointValues1 = {2, 1, 6};
		Deck deck1 = new Deck(ranks1, suits1, pointValues1);
		
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		
		String[] ranks2 = {"A"};
		String[] suits2 = {"Giraffes"};
		int[] pointValues2 = {2};
		Deck deck2 = new Deck(ranks2, suits2, pointValues2);
		
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.size());
		System.out.println(deck2.deal());
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.size());
		System.out.println(deck2.deal());
		
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
		String[] suits = {"spades", "hearts", "diamonds", "clubs"};
		int[] pointValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
		Deck deck = new Deck(ranks, suits, pointValues);
		
		System.out.println(deck);
	}
}
